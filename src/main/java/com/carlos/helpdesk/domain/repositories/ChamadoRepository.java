package com.carlos.helpdesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
