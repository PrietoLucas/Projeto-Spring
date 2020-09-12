package br.com.treino.PT.controller;

import br.com.treino.PT.utils.SenderEmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mail")
public class SendMailController {

    @Autowired
    SenderEmailUtil senderEmailUtil;

    @GetMapping
    public ResponseEntity<?> emailTeste(){

        List<String> emails = new ArrayList<>();
        emails.add("lucas-prieto@hotmail.com");

        String cabecalho = "Testando Aplicação de envio de emails";

        String mensagem = "Teste";

        senderEmailUtil.sendSimpleMessage(emails, cabecalho, mensagem);

        return ResponseEntity.ok().body("Ok");
    }

}
