package com.Eli.lets_do_it.controller;


import com.Eli.lets_do_it.model.User;
import com.Eli.lets_do_it.service.interfaces.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{user_id}")
    public User getUser(@PathVariable Integer user_id){return userService.getUserById(user_id);}

    @PostMapping
    public User createUser(@RequestBody User user){return userService.createUser(user);}

    @PutMapping("/{user_id}")
    public User updateUser(@PathVariable Integer user_id, User user){return userService.updateUser(user_id,user );}

    @DeleteMapping
    public User deleteUser(@PathVariable Integer id){return  userService.deleteUser(id);}

}
