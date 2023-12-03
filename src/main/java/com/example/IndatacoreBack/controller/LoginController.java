package com.example.IndatacoreBack.controller;

import com.example.IndatacoreBack.entities.Employe;
import com.example.IndatacoreBack.entities.Login;
import com.example.IndatacoreBack.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singin")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("")
    public Employe singin(Login login){

        return loginService.login(login);


    }
}
