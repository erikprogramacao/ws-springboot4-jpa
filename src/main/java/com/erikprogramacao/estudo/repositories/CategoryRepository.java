package com.erikprogramacao.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erikprogramacao.estudo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
