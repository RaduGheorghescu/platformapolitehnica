package ro.upb.user;

import java.util.List;

/**
 * Created by radug on 8/4/2017.
 */

public interface UserService {
    List<User> findAll();
    User findOne(Long id);
    void save(User user);
    void update(User user);
    void delete(User user);
}
