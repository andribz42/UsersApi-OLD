package br.com.cotiinformatica.domain.entities;

import java.util.UUID;

import lombok.Data;

@Data
public class Role {
	
	private UUID id;
	private String name;

}
