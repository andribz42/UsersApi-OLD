package br.com.cotiinformatica.domain.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthenticateUserRequestDto {
	
	@NotEmpty(message = "O preenchimento do email é obrigatório.")
	@Email(message = "Informe um endereço de email válido.")
	private String email;
	
	@NotEmpty(message = "O preenchimento da senha é obrigatório.")
	@Size(message = "A senha deve ter pelo menos 8 caracteres")
	private String password;

}
