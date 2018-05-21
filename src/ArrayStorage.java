import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i=0; i<size(); i++){
            storage[i]=null;
        }
    }

    void save(Resume r) {
       // System.out.println(size());
       storage[size()] = r;
    }

    Resume get(String uuid) {
        Resume r=null;
        for (int i=0; i<size(); i++){
            if (storage[i].toString().equals(uuid))
                r=storage[i];
        }
        return r;
        }
    void delete(String uuid) {

        for (int i=0; i<size(); i++){
            if (storage[i].toString().equals(uuid))
                for (int j=i; j<size(); j++){
                storage[j]=storage[j+1];
            if (j==size()-1){storage[j]=null; break;}
            }
            //storage[i+1]=
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

     //  if (size()==0) return null;
       // else
      //      if (size()==1) return storage[0];
      //  else
       return Arrays.copyOfRange(storage, 0, size());

    }

    int size() {

        int m=0;
        for (int i=0; i<10000; i++){
            m=i;
            if (storage[i]==null) break;
        }
return m;

}}
