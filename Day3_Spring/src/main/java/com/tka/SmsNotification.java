package com.tka;

import org.springframework.stereotype.Component;

@Component("smsNotification")
public class SmsNotification implements NotificationService{

	@Override
	public String notification() {
		return "This is a SMS Notification";
	}

}
