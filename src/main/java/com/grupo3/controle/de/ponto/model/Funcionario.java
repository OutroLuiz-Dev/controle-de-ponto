package com.grupo3.controle.de.ponto.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String matricula;
}

