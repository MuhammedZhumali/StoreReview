package backend.service;

import org.springframework.stereotype.Service;

import backend.model.auth.Auth;

@Service
public class AuthService {
    private Auth user;

    public void signUp(Auth newUser) {
        this.user = newUser;
    }
}
