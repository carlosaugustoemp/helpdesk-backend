package com.carlos.helpdesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
