package mx.com.gm.HiSpirng2.dao;

import mx.com.gm.HiSpirng2.domain.Person;
import org.springframework.data.repository.CrudRepository;

                                    //CrudRepository: this interface implements get, insert, update, delete, etc
                                    //spring boot will creaate automatically an implementation from this class
public interface PersonDao extends CrudRepository<Person, Long> {
    //after to extends from CrudRepository, spring boot will create an implementation for us
    
    //but we can add our own customized methods
}
