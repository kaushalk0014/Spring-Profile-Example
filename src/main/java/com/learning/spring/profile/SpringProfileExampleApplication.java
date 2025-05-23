package com.learning.spring.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.order"})
@EntityScan(basePackages = "com.learning.order.entiry")
@EnableJpaRepositories(basePackages = "com.learning.order.repository") 
public class SpringProfileExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileExampleApplication.class, args);
	}

}
