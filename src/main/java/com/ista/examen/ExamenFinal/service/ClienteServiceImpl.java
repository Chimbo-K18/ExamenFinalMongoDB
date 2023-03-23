/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.examen.ExamenFinal.service;

import com.ista.examen.ExamenFinal.model.Cliente;
import com.ista.examen.ExamenFinal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;



@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }

}
