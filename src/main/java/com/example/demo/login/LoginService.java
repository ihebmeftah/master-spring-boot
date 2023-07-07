package com.example.demo.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean authenticate(String name  , String password){
        return name.equalsIgnoreCase("iheb") && password.equalsIgnoreCase("meftah");
    }
}
