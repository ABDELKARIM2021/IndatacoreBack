package com.example.IndatacoreBack.controller;

import com.example.IndatacoreBack.entities.Machine;
import com.example.IndatacoreBack.service.MachineService;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@RestController
@CrossOrigin

@RequestMapping("/objects")
public class ReadTableauCSV {

    @Autowired
    private MachineService machineService;

    @PostMapping("")
    public String saveObjects(@RequestParam("file")MultipartFile file) throws IOException, CsvException{
        try(
            BufferedReader br=new BufferedReader(new InputStreamReader(file.getInputStream()));
            CSVReader csvReader=new CSVReader(br)){
            List<String[]> csvData= csvReader.readAll();
            for (String[] row:csvData){
                if (row.length >= 3){
                    String nom = row[0];
                    String type = row[1];
                    String description=row[2];

                    Machine machine=new Machine();
                    machine.setNom(nom);
                    machine.setType(type);
                    machine.setDescription(description);
                    machineService.save(machine);

                }
            }
            return "fichier importé avec succés";
        }
        }
    }


