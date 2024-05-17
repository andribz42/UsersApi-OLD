package br.com.cotiinformatica.domain.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateUserRequestDto {
	@NotEmpty(message = "O preenchimento do nome é obrigatório.")
	@Size(min = 8, max = 100, message = "O nome deve ter de 8 a 100 caracteres.")
	private String name;

	@NotEmpty(message = "O preenchimento da senha é obrigatório.")
	@Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres.")
	private String email;

	@NotEmpty(message = "O preenchimento da senha é obrigatório.")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "A senha deve ter no mínimo 8 caracteres, pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.")
	private String password;
}
