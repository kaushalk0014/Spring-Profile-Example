package com.learning.spring.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.profile.entiry.Order;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Integer> {

}
