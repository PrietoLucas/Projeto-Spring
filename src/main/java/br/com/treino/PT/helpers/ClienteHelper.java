package br.com.treino.PT.helpers;

import br.com.treino.PT.models.dto.ClienteDTO;
import br.com.treino.PT.models.entities.Cliente;

public class ClienteHelper {

    public static ClienteDTO toDTO(Cliente c){
        return c != null ? new ClienteDTO.Builder()
                .codigo(c.getCodigo())
                .nome(c.getNome())
                .status(c.getStatus())
                .endreco(c.getEndereco())
                .email(c.getEmail())
                .build() : null;
    }

    public Cliente toModel(ClienteDTO c){
        return c != null ? new Cliente.Builder()
                .codigo(c.getCodigo())
                .nome(c.getNome())
                .status(c.getStatus())
                .endereco(c.getEndereco())
                .email(c.getEmail())
                .build() : null;
    }

}
