package ro.upb.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.upb.user.User;

import java.util.List;

/**
 * Created by radug on 8/5/2017.
 */

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{
    List<Post> findAllByUser(User user);
}
