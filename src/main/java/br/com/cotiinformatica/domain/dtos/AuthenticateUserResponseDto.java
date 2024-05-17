package br.com.cotiinformatica.domain.dtos;

import java.time.Instant;
import java.util.UUID;

import lombok.Data;

@Data
public class AuthenticateUserResponseDto {
	
	private UUID id;
	private String name;
	private String email;
	private String role;
	private String accessToken;
	private Instant expiration; 
}
