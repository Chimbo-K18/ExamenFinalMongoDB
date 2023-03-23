/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.examen.ExamenFinal.controller;

import com.ista.examen.ExamenFinal.model.Cliente;
import com.ista.examen.ExamenFinal.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
   



@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarClientes() {
        return new ResponseEntity<>(clienteService.findByAll(), 
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearCliente(
            @RequestBody Cliente p) {
        return new ResponseEntity<>(clienteService.save(p), 
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable Long id, @RequestBody Cliente p) {
        Cliente clienteEncontrado = clienteService.findById(id);
        if (clienteEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                clienteEncontrado.setNombre_cliente(p.getNombre_cliente());
                clienteEncontrado.setApellido_cliente(p.getApellido_cliente());
                clienteEncontrado.setCedula_cliente(p.getCedula_cliente());
                clienteEncontrado.setCorreo_cliente(p.getCorreo_cliente());
                
                return new ResponseEntity<>(clienteService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminarCliente(@PathVariable Long id) {
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}