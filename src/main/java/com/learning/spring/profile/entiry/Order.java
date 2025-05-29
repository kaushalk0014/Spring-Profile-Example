package com.learning.spring.profile.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Order_details")
@Entity
public class Order {

	@Id
	@GeneratedValue
	private Integer Id;
	private String name;
	private String orderId;
	private Double price;
	private Integer qnt;
	@Version
	private int version;
	
	@Transient
	private String userId;
	
	private String address;

}
