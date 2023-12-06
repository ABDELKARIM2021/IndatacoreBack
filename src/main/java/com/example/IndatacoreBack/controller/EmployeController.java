package com.example.IndatacoreBack.controller;

import com.example.IndatacoreBack.entities.Employe;
import com.example.IndatacoreBack.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;





@RestController
@CrossOrigin
@RequestMapping("/singup")

public class EmployeController {

    @Autowired
    private EmployeService employeService;


    @PostMapping("")
    public ResponseEntity<?> singup(@RequestBody Employe employe){
		System.out.println("Requête reçue pour l'inscription : " + employe.toString());
		Employe savedEmploye= employeService.save(employe);
		
		if (savedEmploye != null) {
            return ResponseEntity.ok(savedEmploye);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur lors de l'enregistrement de l'employé."); 
    }
}

	
}