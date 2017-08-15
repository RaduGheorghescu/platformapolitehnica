package ro.upb.site.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by radug on 8/6/2017.
 */

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping("/findOne")
    public Post findOne(@RequestParam Long id){
        return postService.findOne(id);
    }

    @GetMapping("/all")
    public List<Post> findAll(){
        return postService.findAll();
    }
}
