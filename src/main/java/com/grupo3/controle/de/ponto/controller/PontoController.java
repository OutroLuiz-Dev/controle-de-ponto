package com.grupo3.controle.de.ponto.controller;

import com.grupo3.controle.de.ponto.model.Funcionario;
import com.grupo3.controle.de.ponto.model.RegistroPonto;
import com.grupo3.controle.de.ponto.service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pontos")
public class PontoController {

    @Autowired
    private PontoService pontoService;

    @PostMapping("/funcionario")
    public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario) {
        return pontoService.salvarFuncionario(funcionario);
    }

    @PostMapping("/entrada/{funcionarioId}")
    public RegistroPonto registrarEntrada(@PathVariable Long funcionarioId) {
        return pontoService.registrarEntrada(funcionarioId);
    }

    @PutMapping("/saida/{registroId}")
    public RegistroPonto registrarSaida(@PathVariable Long registroId) {
        return pontoService.registrarSaida(registroId);
    }

    @GetMapping
    public List<RegistroPonto> listarRegistros() {
        return pontoService.listarRegistros();
    }
}
