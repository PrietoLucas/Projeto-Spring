package br.com.treino.PT.services.impl;

import br.com.treino.PT.models.entities.Cliente;
import br.com.treino.PT.repository.ClienteRepository;
import br.com.treino.PT.services.ClienteService;
import br.com.treino.PT.utils.SenderEmailUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private SenderEmailUtil senderEmailUtil;

    Logger logger = LoggerFactory.getLogger(ClienteServiceImpl.class);


    @Override
    @Scheduled(fixedRate = 15000)
    public void buscarClientesPendentes() {
        logger.info("Iniciando verificação no Banco!");
        try {
            List<Cliente> cliente = clienteRepository.findAll();

            String cabecalho = "Testando Aplicação de envio de emails";

            String mensagem = "Teste";

            List<String> emails = new ArrayList<>();

            for (Cliente cliente1 : cliente) {

                if (cliente1.getStatus() == 1) {
                    if(cliente1.getEmail() == null || cliente1.getEmail() == "" ||
                            cliente1.getEmail().equals("") || cliente1.getEmail().isEmpty() ||
                            cliente1.getEmail().isBlank()){

                        emails.add("noreply@testelucas.com.br");
                    } else {
                        emails.add(cliente1.getEmail());
                    }
                }

            }
            logger.info("Emails: " + emails);
            senderEmailUtil.sendSimpleMessage(emails, cabecalho, mensagem);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("Erro: "+e);
        }
        logger.info("Finalizado verificação no Banco!");
    }

}
