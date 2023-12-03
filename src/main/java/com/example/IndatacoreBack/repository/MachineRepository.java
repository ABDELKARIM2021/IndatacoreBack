package com.example.IndatacoreBack.repository;

import com.example.IndatacoreBack.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends JpaRepository<Machine,Integer> {
}
