package ro.upb.site.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by radug on 8/5/2017.
 */

@Service
public class PostServiceImp implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findOne(Long id) {
        return postRepository.findOne(id);
    }

    @Override
    public void save(Post post) {

    }

    @Override
    public void update(Post post) {

    }

    @Override
    public void delete(Post post) {

    }
}
