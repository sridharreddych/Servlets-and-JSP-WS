package org.sree.service;

import java.util.HashMap;

import org.sree.dto.User;

public class LoginService {

	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService() {
		 users.put("Sridharreddy","Sridhr Reddy");
		 users.put("Rashmi Kiran","Rashmi Kiran");
		 users.put("Vaidhay Reddy","Vaidhay Reddy");
	}
	
	public boolean authenticate(String userId,String password){
		
		if(password==null || password.trim()=="") {
			return false;
		}
		return true;
	}
	
		public User getUserDetails(String userId) {
			User user = new User();
			user.setUserName(users.get(userId));
			user.setUserId(userId);
			return user;
		}
	}
