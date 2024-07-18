package com.anirudha1101.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthonticateService {
	
	public  boolean authenticate(String username ,String Password) {
		boolean isValidUser=username.equalsIgnoreCase("Anirudha");
		boolean isValidPassword=Password.equalsIgnoreCase("Anirudha@1101");
		return isValidUser && isValidPassword;
	}

}
