package com.edsonrego.apicrudclientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edsonrego.apicrudclientes.entities.Client;
import com.edsonrego.apicrudclientes.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public List<Client> findAll(){
		return repository.findAll();
	}
}
