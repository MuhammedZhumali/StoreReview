package backend.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import backend.model.user.User;
import backend.repository.UserRepo;

import java.util.*;

@Service
@Transactional
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

    public User createUser(User user){
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

    public User updateUser(Long id, User user){
        Optional<User> existingUser = userRepo.findById(id);
        if(existingUser.isPresent()){
            User updateUser = existingUser.get();

            if(user.getUsername() != null){
                updateUser.setUsername(user.getUsername());
            }
            if(user.getEmail() != null){
                updateUser.setEmail(user.getEmail());
            }
            return userRepo.save(updateUser);
        }else{
            throw new IllegalArgumentException("User with id " + id + " not found");
        }
    }
}
