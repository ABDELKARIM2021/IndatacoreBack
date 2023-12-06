package com.example.IndatacoreBack.controller;

import com.example.IndatacoreBack.entities.Machine;
import com.example.IndatacoreBack.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/machines")
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

    @GetMapping("")
    public List<Machine> get(){
		System.out.print("********************** getAll machine invoqued ******************");
      return   machineService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Machine> getMachineById(@PathVariable Integer id) {
        return machineService.getMachineById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
	
	    @PutMapping("/{id}")
    public ResponseEntity<Machine> updateMachine(@PathVariable Integer id, @RequestBody Machine updatedMachine) {
        return machineService.getMachineById(id)
                .map(existingMachine -> {
                    existingMachine.setNom(updatedMachine.getNom());
                    existingMachine.setType(updatedMachine.getType());
                    existingMachine.setDescription(updatedMachine.getDescription());
                    Machine savedMachine = machineService.saveMachine(existingMachine);
                    return ResponseEntity.ok(savedMachine);
                })
                .orElse(ResponseEntity.notFound().build());
    }
	
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMachine(@PathVariable Integer id) {
        machineService.deleteMachine(id);
        return ResponseEntity.noContent().build();
    }


}
