package br.com.cotiinformatica.domain.entities;

import java.util.UUID;

import lombok.Data;

@Data
public class User {

	private UUID id;
	private String name;
	private String email;
	private String password;
}
