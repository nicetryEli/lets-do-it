package com.Eli.lets_do_it.service.interfaces;

import com.Eli.lets_do_it.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Integer id);
    User createUser(User user);
    User updateUser(Integer id, User user);
    User deleteUser(Integer id);
}
