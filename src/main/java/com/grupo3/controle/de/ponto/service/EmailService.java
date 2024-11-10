package com.grupo3.controle.de.ponto.service;


import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class EmailService {

    @Value("${sendgrid.api.key}")
    private String apiKey;

    @Value("${sendgrid.from.email}")
    private String emailOrigem;

    public void sendEmail(String emailDestino, String tipoRegistro, String nomeFuncionario, LocalDateTime localDateTime) throws IOException {
        Email from = new Email(emailOrigem);
        Email to = new Email(emailDestino);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        String dataHora = formatter.format(localDateTime);
        String content = String.format("Olá, %s! \nSeu ponto de %s foi registrado em:\n%s.", nomeFuncionario,tipoRegistro, dataHora);
        String assunto = String.format("Registro de Ponto - %s", tipoRegistro);

        Content emailContent = new Content("text/plain", content);
        Mail mail = new Mail(from, assunto, to, emailContent);

        SendGrid sg = new SendGrid(apiKey);
        Request request = new Request();
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            sg.api(request);

    }
}