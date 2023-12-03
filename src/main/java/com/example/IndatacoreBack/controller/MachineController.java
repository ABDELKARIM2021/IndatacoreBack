package com.example.IndatacoreBack.controller;

import com.example.IndatacoreBack.entities.Machine;
import com.example.IndatacoreBack.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/machine")
public class MachineController {

    @Autowired
    private MachineService machineService;

    @PostMapping("postmachine")
    public Machine post(@RequestBody Machine machine){

        return machineService.save(machine);
    }

    @PostMapping("/machinealeatoire")
    public Machine post(){
        Random random=new Random();
        String nom="nom"+ random.nextInt(10);
        String type="type"+ random.nextInt(10);
        String description="description"+ random.nextInt(10);

        Machine machine= new Machine();
        machine.setNom(nom);
        machine.setType(type);
        machine.setDescription(description);

        return machineService.save(machine);

    }

    @GetMapping("/getmachines")
    public List<Machine> get(){
      return   machineService.getAll();
    }



}
