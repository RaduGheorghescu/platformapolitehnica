package ro.upb.site.post;

import java.util.List;

/**
 * Created by radug on 8/5/2017.
 */
public interface PostService {
    List<Post> findAll();
    Post findOne(Long id);
    void save(Post post);
    void update(Post post);
    void delete(Post post);
}
