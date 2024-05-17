package br.com.cotiinformatica.domain.service;

import java.time.Instant;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.domain.dtos.AuthenticateUserRequestDto;
import br.com.cotiinformatica.domain.dtos.AuthenticateUserResponseDto;
import br.com.cotiinformatica.domain.dtos.CreateUserRequestDto;
import br.com.cotiinformatica.domain.dtos.CreateUserResponseDto;
import br.com.cotiinformatica.domain.entities.Role;
import br.com.cotiinformatica.domain.entities.User;
import br.com.cotiinformatica.domain.interfaces.UserDomainService;
import br.com.cotiinformatica.infrastructure.components.SHA256Component;
import br.com.cotiinformatica.infrastructure.repositories.RoleRepository;
import br.com.cotiinformatica.infrastructure.repositories.UserRepository;

@Service
public class UserDomainServiceImpl implements UserDomainService {

	@Autowired ModelMapper modelMapper;
	@Autowired UserRepository userRepository;
	@Autowired RoleRepository roleRepository;
	@Autowired SHA256Component sha256Component;
	
	@Override
	public AuthenticateUserResponseDto authenticate(AuthenticateUserRequestDto request) {
		AuthenticateUserResponseDto response = new AuthenticateUserResponseDto();
		return response;
	}

	@Override
	public CreateUserResponseDto create(CreateUserRequestDto request) {

		Role role = roleRepository.findByName("DEFAULT");
		User user = modelMapper.map(request, User.class);
		user.setId(UUID.randomUUID());
		user.setRole(role);
		user.setPassword(sha256Component.hash(request.getPassword()));
		
		userRepository.save(user);
		
		CreateUserResponseDto response = modelMapper.map(user, CreateUserResponseDto.class);
		response.setRole(user.getRole().getName());
		response.setCreatedAt(Instant.now());
			
		return response;
	}
	

}
