package com.erikprogramacao.estudo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erikprogramacao.estudo.entities.Product;
import com.erikprogramacao.estudo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired //dependency injection
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
