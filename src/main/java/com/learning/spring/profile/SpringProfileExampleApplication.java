package com.learning.spring.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.learning.spring.profile.service.DevNotificationService;
import com.learning.spring.profile.service.Notification;
import com.learning.spring.profile.service.ProdNotificationService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.spring.profile"})
@EntityScan(basePackages = "com.learning.spring.profile.entiry")
@EnableJpaRepositories(basePackages = "com.learning.spring.profile.repository") 
public class SpringProfileExampleApplication {

	@Autowired
	private Environment env;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProfileExampleApplication.class, args);
	}

	
//	@Bean
//    public Notification myService() {
//        String envType = env.getProperty("spring.profiles.active");
//        if ("dev".equals(envType)) {
//            return new DevNotificationService();
//        } else {
//            return new ProdNotificationService();
//        }
//    }
}
