package com.example.IndatacoreBack.controller;

import com.example.IndatacoreBack.entities.Employe;
import com.example.IndatacoreBack.entities.Login;
import com.example.IndatacoreBack.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin
@RequestMapping("/singin")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("")
    public Employe singin(@RequestBody Login login){
System.out.println("invoke singin");
        return loginService.login(login);


    }
	/**
	@GetMapping("")
	public Employe get(){
		return "hello";
	}*/
}
