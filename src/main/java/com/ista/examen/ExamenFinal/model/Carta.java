/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.examen.ExamenFinal.model;

/**
 *
 * @author matei
 */

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Carta")
@Data


public class Carta {
    
    @Id
    private Long id_carta;
    private String nombre_carta;
    private String categoria;
    private Integer cantidad;
    private Plato platos;
    private List listadeplatos;
    
}
