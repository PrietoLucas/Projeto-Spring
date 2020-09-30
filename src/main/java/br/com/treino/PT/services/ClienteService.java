package br.com.treino.PT.services;

import br.com.treino.PT.models.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {

    void buscarClientesPendentes();

    List<ClienteDTO> listarTodosClientes();
}
