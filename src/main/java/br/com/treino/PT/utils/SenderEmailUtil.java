package br.com.treino.PT.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SenderEmailUtil {

    @Autowired
    private JavaMailSender emailSender;

    Logger logger = LoggerFactory.getLogger(SenderEmailUtil.class);

    public void sendSimpleMessage(List<String> destino, String cabecalho, String mensagem){
        try {
            logger.info("Iniciando envio de emails!");

            for (String destinos : destino) {

                SimpleMailMessage msg = new SimpleMailMessage();
                msg.setTo(destinos);

                msg.setSubject(cabecalho);
                msg.setText(mensagem);

                emailSender.send(msg);
            }
            logger.info("Finalizado envio de emails!");
        } catch (Exception e){
            e.printStackTrace();
            logger.error("Erro: "+e);
        }
    }

}
