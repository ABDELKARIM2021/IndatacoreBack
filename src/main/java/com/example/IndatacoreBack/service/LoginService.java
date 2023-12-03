package com.example.IndatacoreBack.service;

import com.example.IndatacoreBack.entities.Employe;
import com.example.IndatacoreBack.entities.Login;
import com.example.IndatacoreBack.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private EmployeRepository employeRepository;
    public Employe login(Login login){

      Employe  checkEmploye= employeRepository.findEmployeByEmailAndPassword(login.getEmail(),login.getPassword());
        if (checkEmploye!=null){
            return checkEmploye;
        }
        else {
            return null;
        }
    }
}
