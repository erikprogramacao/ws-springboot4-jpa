package com.erikprogramacao.estudo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erikprogramacao.estudo.entities.User;
import com.erikprogramacao.estudo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired //dependency injection
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
