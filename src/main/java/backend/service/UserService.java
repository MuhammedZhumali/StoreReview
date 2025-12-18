package backend.service;

import org.springframework.stereotype.Service;
import backend.model.user.User;
import backend.repository.UserRepo;

import java.util.*;

@Service
public class UserService {
    private UserRepo userRepo; 

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUserByUsername(String username){
        return userRepo.findByUsername(username);
    }

    public Optional<User> getUserById(Long id){
        Optional<User> user = userRepo.findById(id);
        if(user.isEmpty()){
            throw new IllegalArgumentException("User with id " + id + " not found");
        }
        return user;
    }
}
