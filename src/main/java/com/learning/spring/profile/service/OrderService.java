package com.learning.spring.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.learning.spring.profile.entiry.Order;
import com.learning.spring.profile.repository.OrderRepositry;

@Service
public class OrderService {

	@Autowired
	private Environment env;
	
	@Autowired
	private OrderRepositry orderRepositry;

	@Autowired
	private Notification notification;

	public Order saveOrder(Order order) {
		
		System.out.println("##################################");
		System.out.println("Enviroment Name :"+env.getProperty("spring.profiles.active"));
		Order odr = orderRepositry.save(order);
		 
		
		notification.sendNotification();

		return odr;
	}

	public List<Order> getAllOrders() {
		return orderRepositry.findAll();
	}

	public Order getOrderById(Integer id) {
		return orderRepositry.findById(id).get();
	}

}
