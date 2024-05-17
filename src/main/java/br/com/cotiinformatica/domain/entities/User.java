package br.com.cotiinformatica.domain.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class User {

	@Id
	private UUID id;
	
	private String name;
	
	@Indexed(unique = true)
	private String email;
	
	private String password;
	
	// Referência no Banco de Dados
	@DBRef
	private Role role;
}
