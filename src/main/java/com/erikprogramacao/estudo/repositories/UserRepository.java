package com.erikprogramacao.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erikprogramacao.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
