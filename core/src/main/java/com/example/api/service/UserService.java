package com.example.api.service;

import com.example.api.model.User;
import com.example.api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    public User findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
    public User updateUser(Long id, User userMod){
       User existingUser = userRepository.findById(id).orElseThrow();

        existingUser.setName(userMod.getName());
        existingUser.setEmail(userMod.getEmail());

       return userRepository.save(existingUser);
    }
}
