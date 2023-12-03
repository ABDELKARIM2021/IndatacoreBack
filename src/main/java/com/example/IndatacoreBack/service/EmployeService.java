package com.example.IndatacoreBack.service;

import com.example.IndatacoreBack.entities.Employe;
import com.example.IndatacoreBack.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {


    @Autowired
    private EmployeRepository employeRepository;
    public Employe save(Employe employe){
       Employe checkEmploye= employeRepository.findEmployeByEmail(employe.getEmail());
       if (checkEmploye!=null){
         Employe  savedEmploye=employeRepository.save(employe);
         return savedEmploye;
       }
       else {
           return null;
       }
    }














}
