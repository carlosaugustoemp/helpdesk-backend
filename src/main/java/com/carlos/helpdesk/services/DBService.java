package com.carlos.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.helpdesk.domain.Chamado;
import com.carlos.helpdesk.domain.Cliente;
import com.carlos.helpdesk.domain.Tecnico;
import com.carlos.helpdesk.domain.enums.Perfil;
import com.carlos.helpdesk.domain.enums.Prioridade;
import com.carlos.helpdesk.domain.enums.Status;
import com.carlos.helpdesk.domain.repositories.ChamadoRepository;
import com.carlos.helpdesk.domain.repositories.ClienteRepository;
import com.carlos.helpdesk.domain.repositories.TecnicoRepository;

@Service
public class DBService {
	
	
	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;	
	
	public void instanciaDB() {
			
		
		Tecnico tec1 = new Tecnico(null, "Carlos Augusto", "37069869061", "carlosaugustoemp@gmail.com", "123");
		tec1.addPerfi(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "ClienteX", "14140636017", "cliente@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
		
		
		
	}

}
