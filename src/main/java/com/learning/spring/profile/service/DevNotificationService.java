package com.learning.spring.profile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
//@Primary
public class DevNotificationService implements Notification{

	@Value("${notification-type}")
	private String notificationType;
	
	@Override
	public void sendNotification() {
		
		System.out.println("Notification send on "+ notificationType);
	}

}
