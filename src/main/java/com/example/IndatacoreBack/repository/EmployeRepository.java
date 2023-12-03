package com.example.IndatacoreBack.repository;

import com.example.IndatacoreBack.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EmployeRepository extends JpaRepository<Employe,Integer> {

    public Employe findEmployeByEmail(String email);

    public  Employe findEmployeByEmailAndPassword(String email,String password);
}
