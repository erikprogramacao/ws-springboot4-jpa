package com.erikprogramacao.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erikprogramacao.estudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
