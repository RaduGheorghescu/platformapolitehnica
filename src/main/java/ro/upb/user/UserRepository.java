package ro.upb.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by radug on 8/4/2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    //TODO: De mentionat in video la momentul ... repo ca am gresit
}
