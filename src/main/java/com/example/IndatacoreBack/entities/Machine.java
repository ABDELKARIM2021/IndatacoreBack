package com.example.IndatacoreBack.entities;

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
public class Machine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String type;

    private String description;


}
