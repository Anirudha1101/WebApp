package com.anirudha1101.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LogInController {
	private AuthonticateService authenticationService;
	
	
	public LogInController(AuthonticateService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login" ,method= RequestMethod.GET)
	//@ResponseBody
	public String logIn( ) {
		// System.out.println("request parameter "+ name);
		//ModelMap model
		//model.put( "name" ,name);
		return "login";
	}
	
	@RequestMapping(value="login" ,method= RequestMethod.POST)
	 public String welcomePage( @RequestParam String name , @RequestParam String Passsword ,ModelMap model) {
		if(authenticationService.authenticate(name ,Passsword)){
	     	model.put("name", name);
		    model.put("Passsword", Passsword);
		   return "welcome";
	    }
		model.put("errorMessage","Invalid Credentals !pls try again");
	   return "login";

	 }
	
}
