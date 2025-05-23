package com.learning.spring.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.profile.dto.OrderRequestDTO;
import com.learning.spring.profile.entiry.Order;
import com.learning.spring.profile.entiry.PurchaseOrder;
import com.learning.spring.profile.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/save")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order){
		order=service.saveOrder(order);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getById")
	public ResponseEntity<Order> getOrderById(@RequestParam Integer id){
		Order order=service.getOrderById(id);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<PurchaseOrder> createOrder(@RequestBody OrderRequestDTO dto) {
		PurchaseOrder purchaseOrder=service.createOrder(dto);
		return new ResponseEntity<PurchaseOrder>(purchaseOrder, HttpStatus.OK);
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<PurchaseOrder>> getOrders(){
		List <PurchaseOrder> list= service.getAllOrders();
		return new ResponseEntity<List<PurchaseOrder>>(list, HttpStatus.OK);
	}
}
