package br.com.treino.PT.controller;

import br.com.treino.PT.models.dto.ClienteDTO;
import br.com.treino.PT.models.entities.Cliente;
import br.com.treino.PT.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes",produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){

        return ResponseEntity.ok().body(service.listarTodosClientes());
    }

}
