package br.com.cotiinformatica.application.controllers;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.domain.dtos.CreateUserRequestDto;
import br.com.cotiinformatica.domain.dtos.CreateUserResponseDto;
import br.com.cotiinformatica.domain.interfaces.UserDomainService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired UserDomainService userDomainService;
	
	@PostMapping("authenticate")
	public void authenticate(@RequestBody CreateUserRequestDto request) {
		throw new NotImplementedException();
	}
	
	@PostMapping("create")
	public ResponseEntity<CreateUserResponseDto> create( @RequestBody @Valid CreateUserRequestDto request ) {
		return ResponseEntity.status(201).body(userDomainService.create(request));
	}
	
}
