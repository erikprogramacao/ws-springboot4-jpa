package com.erikprogramacao.estudo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erikprogramacao.estudo.entities.Category;
import com.erikprogramacao.estudo.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired //dependency injection
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
