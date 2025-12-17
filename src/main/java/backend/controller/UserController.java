package backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/health")
    public String healthCheck() {
        return "UserController is up and running!";
    }    
}
