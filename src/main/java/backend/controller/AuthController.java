package backend.controller;

import org.springframework.web.bind.annotation.*;

import backend.service.UserService;
import backend.model.auth.Auth;
import backend.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController  {
    private AuthService service;
    
    @PostMapping("/signup")
    public void signUp(@RequestBody Auth newUser) {
        service.signUp(newUser);
    }
}
