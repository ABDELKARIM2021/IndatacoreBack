package com.example.IndatacoreBack.service;

import com.example.IndatacoreBack.entities.Machine;
import com.example.IndatacoreBack.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
