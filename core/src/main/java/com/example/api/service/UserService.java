package com.example.api.service;

import com.example.api.model.User;
import com.example.api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
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

    public User updateUser(Long id, User updateUser){
       User existingUser = userRepository.findById(id).orElseThrow();

        existingUser.setName(updateUser.getName());
        existingUser.setEmail(updateUser.getEmail());

       return userRepository.save(existingUser);
    }
}
