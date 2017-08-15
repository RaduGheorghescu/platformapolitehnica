package ro.upb.general.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by radug on 8/4/2017.
 */

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/findOne")
    public User findOne(@RequestParam Long id){
        return userService.findOne(id);
    }

    @PostMapping("/findOne")
    public void editUser(@RequestParam Long id, @RequestBody User user){
        userService.save(user);
    }

    @PutMapping("/findOne")
    public void updateUser(@RequestParam Long id, @RequestBody User user){
        userService.update(user);
    }

    @DeleteMapping("/findOne")
    public void deleteUser(@RequestParam Long id, @RequestBody User user){
        userService.delete(user);
    }

}
