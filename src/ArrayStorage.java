
import java.util.Arrays;


/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private int size = 0;
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    void save(Resume r) {
        if (size == storage.length)
            System.out.println("Память заполнена!");
        else {
            storage[size] = r;
            size++;
        }
    }

    Resume get(String uuid) {
        int i;
        for (i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid))
                break;
        }
        return storage[i];
    }

    void delete(String uuid) {
        int i;
        for (i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                break;
            }

        }
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        return Arrays.copyOfRange(storage, 0, size);

    }

    int size() {

        return size;

    }
}
