package com.grupo3.controle.de.ponto.repository;

import com.grupo3.controle.de.ponto.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
