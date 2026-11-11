package com.erikprogramacao.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erikprogramacao.estudo.entities.Product;

public interface ProductRepository extends JpaRepository<Product
, Long>{

}
