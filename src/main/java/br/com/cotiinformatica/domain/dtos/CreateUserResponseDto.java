package br.com.cotiinformatica.domain.dtos;

import java.time.Instant;
import java.util.UUID;

import lombok.Data;

@Data
public class CreateUserResponseDto {

	private UUID id;
	private String name;
	private String email;
	private String role;
	private Instant createdAt;
}
