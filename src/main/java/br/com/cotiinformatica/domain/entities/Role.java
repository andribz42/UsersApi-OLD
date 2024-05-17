package br.com.cotiinformatica.domain.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Role {
	
	@Id
	private UUID id;
	
	@Indexed(unique = true)
	private String name;
}
