package com.carlos.helpdesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
