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

      Employe checkEmploye = employeRepository.findEmployeByEmail(login.getEmail());

        if (checkEmploye != null && checkEmploye.getPassword().equals(login.getPassword())) {
            return checkEmploye;
        } else {
            return null;
        }
		
		
}
/**
public Employe test(Login login){
	      Employe checkEmploye = employeRepository.findEmployeByEmail(login.getEmail());
return checkEmploye;
}*/
}
