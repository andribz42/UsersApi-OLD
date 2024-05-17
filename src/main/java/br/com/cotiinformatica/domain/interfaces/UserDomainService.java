package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.dtos.AuthenticateUserRequestDto;
import br.com.cotiinformatica.domain.dtos.AuthenticateUserResponseDto;
import br.com.cotiinformatica.domain.dtos.CreateUserRequestDto;
import br.com.cotiinformatica.domain.dtos.CreateUserResponseDto;

public interface UserDomainService {
	
	AuthenticateUserResponseDto authenticate( AuthenticateUserRequestDto request);
	CreateUserResponseDto create( CreateUserRequestDto request);

}
