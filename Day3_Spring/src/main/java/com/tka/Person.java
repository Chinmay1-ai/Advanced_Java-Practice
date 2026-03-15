package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	@Qualifier("emailNotification")
	NotificationService notification1;

	@Autowired
	@Qualifier("smsNotification")
	NotificationService notification2;

	public NotificationService getNotification1() {
		return notification1;
	}

	public void setNotification1(NotificationService notification1) {
		this.notification1 = notification1;
	}

	public NotificationService getNotification2() {
		return notification2;
	}

	public void setNotification2(NotificationService notification2) {
		this.notification2 = notification2;
	}

	@Override
	public String toString() {
		return "Person [notification1=" + notification1 + ", notification2=" + notification2 + "]";
	}

}
