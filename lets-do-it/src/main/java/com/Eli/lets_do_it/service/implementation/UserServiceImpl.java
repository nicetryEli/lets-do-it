package com.Eli.lets_do_it.service.implementation;

import com.Eli.lets_do_it.model.User;
import com.Eli.lets_do_it.repository.UserRepository;
import com.Eli.lets_do_it.service.interfaces.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("cant find user"));
    }

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer id, User user){
        User tmp = userRepository.findById(id).orElseThrow(()-> new RuntimeException("there is no user with that id"));
        tmp.setUsername(user.getUsername());
        tmp.setEmail(user.getEmail());
        tmp.setCreated_at(LocalDateTime.now());
        return userRepository.save(tmp);
    }

    @Override
    public User deleteUser(Integer id){
        User tmp = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        userRepository.delete(tmp);
        return tmp;
    }
}
