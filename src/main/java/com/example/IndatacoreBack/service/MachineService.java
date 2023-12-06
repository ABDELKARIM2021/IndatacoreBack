package com.example.IndatacoreBack.service;

import com.example.IndatacoreBack.entities.Machine;
import com.example.IndatacoreBack.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;


@Service
public class MachineService {

    @Autowired
    private MachineRepository machineRepository;
    public Machine save(Machine machine){
        return machineRepository.save(machine);
    }

	
    public List<Machine> getAll() {
        return machineRepository.findAll();
    }
	
	public Optional<Machine> getMachineById(Integer id) {
        return machineRepository.findById(id);
    }
	
	  public Machine saveMachine(Machine machine) {
        return machineRepository.save(machine);
    }
	
	   public void deleteMachine(Integer id) {
        machineRepository.deleteById(id);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

