package com.example.IndatacoreBack.entities;


import com.fasterxml.jackson.core.SerializableString;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String email;
    private String password;



}
