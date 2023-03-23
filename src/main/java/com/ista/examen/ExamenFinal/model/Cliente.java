/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.examen.ExamenFinal.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author matei
 */
@Getter
@Setter
@Document(collection = "Cliente")
@Data

public class Cliente {
    
    @Id
    private Long id_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String cedula_cliente;
    private String correo_cliente;
    private Restaurante restaurante;

}
