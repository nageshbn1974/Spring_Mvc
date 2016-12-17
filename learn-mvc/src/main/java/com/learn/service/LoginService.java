package com.learn.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userId, String password) {
		return userId.equalsIgnoreCase("nageshbn") && password.equals("nageshbn1974");
	}

}
