/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ista.examen.ExamenFinal.repository;

import com.ista.examen.ExamenFinal.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author matei
 */
public interface ClienteRepository extends MongoRepository<Cliente, Long>{
    
}
