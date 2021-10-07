package com.edsonrego.apicrudclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edsonrego.apicrudclientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
