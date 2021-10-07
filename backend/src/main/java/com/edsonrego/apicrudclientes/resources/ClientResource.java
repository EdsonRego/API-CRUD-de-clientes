package com.edsonrego.apicrudclientes.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsonrego.apicrudclientes.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria" , "19670960761", 3000.00 , Instant.now() , 2));
		list.add(new Client(2L, "Edson" , "20633150861", 4000.00 , Instant.now() , 4));
		return ResponseEntity.ok().body(list);
	}

}
