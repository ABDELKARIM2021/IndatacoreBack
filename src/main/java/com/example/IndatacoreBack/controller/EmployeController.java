package com.example.IndatacoreBack.controller;

import com.example.IndatacoreBack.entities.Employe;
import com.example.IndatacoreBack.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singup")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping("")
    public Employe singup(@RequestBody Employe employe){
        return employeService.save(employe);
    }
}
