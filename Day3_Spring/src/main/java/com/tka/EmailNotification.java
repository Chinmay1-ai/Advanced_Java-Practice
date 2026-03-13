package com.tka;

import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotification implements NotificationService {

	@Override
	public String notification() {
		return"This is Email Notification";
	}

}
