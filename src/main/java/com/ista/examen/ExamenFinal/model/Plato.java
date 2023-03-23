/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.examen.ExamenFinal.model;

/**
 *
 * @author matei
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Plato")
@Data

public class Plato {
    
    @Id
    private Long id_plato;
    private String nombrePlato;
    private String descripcion_plato;
    private Double precio;

    
}
