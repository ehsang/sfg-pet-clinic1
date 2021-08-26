package guru.springframework.sfgpetclinic.services;

import java.util.Optional;
import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id); // it is going to return a T (which is an 'owner' object)

    T save (T object);

    void delete (T object);

    void deleteById (ID id);

}
