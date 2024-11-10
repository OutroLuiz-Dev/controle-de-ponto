package com.grupo3.controle.de.ponto.service;

import com.grupo3.controle.de.ponto.model.Funcionario;
import com.grupo3.controle.de.ponto.model.RegistroPonto;
import com.grupo3.controle.de.ponto.repository.FuncionarioRepository;
import com.grupo3.controle.de.ponto.repository.RegistroPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PontoService {

    @Autowired
    private EmailService emailService;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private RegistroPontoRepository registroPontoRepository;

    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public RegistroPonto registrarEntrada(Long funcionarioId) throws IOException {
        Funcionario funcionario = funcionarioRepository.findById(funcionarioId).orElseThrow();
        RegistroPonto registro = new RegistroPonto();
        registro.setFuncionario(funcionario);
        registro.setHorarioEntrada(LocalDateTime.now());

        emailService.sendEmail(funcionario.getEmail(), "Entrada", funcionario.getNome(), registro.getHorarioEntrada());
        return registroPontoRepository.save(registro);
    }

    public RegistroPonto registrarSaida(Long registroId) throws IOException {
        RegistroPonto registro = registroPontoRepository.findById(registroId).orElseThrow();
        registro.setHorarioSaida(LocalDateTime.now());

        emailService.sendEmail(registro.getFuncionario().getEmail(), "Saída", registro.getFuncionario().getNome(), registro.getHorarioSaida());
        return registroPontoRepository.save(registro);
    }

    public List<RegistroPonto> listarRegistros() {
        return registroPontoRepository.findAll();
    }
}
