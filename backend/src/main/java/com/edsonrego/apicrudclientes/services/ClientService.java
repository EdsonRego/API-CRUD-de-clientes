package com.edsonrego.apicrudclientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsonrego.apicrudclientes.entities.Client;
import com.edsonrego.apicrudclientes.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll(){
		return repository.findAll();
	}
}
