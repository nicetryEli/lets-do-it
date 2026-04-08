package com.Eli.lets_do_it.controller;


import com.Eli.lets_do_it.model.User;
import com.Eli.lets_do_it.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Integer userId){return userService.getUserById(userId);}

    @PostMapping
    public User createUser(@RequestBody User user){return userService.createUser(user);}

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Integer userId, @RequestBody User user){return userService.updateUser(userId,user );}

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Integer id){return  userService.deleteUser(id);}

}
