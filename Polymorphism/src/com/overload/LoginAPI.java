package com.overload;

public class LoginAPI {

	public String loginAPI(String username) {
		return username;
	}

	public int loginAPI(String username, int password) {
		return password;
	}

	public static void main(String[] args) {

		LoginAPI api = new LoginAPI();

		System.out.println("Username : " + api.loginAPI("Chinmay@gmail.com"));
		System.out.println("Password : " + api.loginAPI("Chinmay@gmail.com", 12345));
	}
}
