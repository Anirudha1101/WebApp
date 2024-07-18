package com.anirudha1101.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class sayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "hello ! i am learning spring boot today";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> This is my First Html page ");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body> Hello anirudha Keep trying and learning");
		sb.append("</bodyl>");
		sb.append("</html>");
		
		return sb.toString();
		
	}
	// redirect say-hello-jsp ==> sayHello.jsp
	// myfirstwebapp /src/main/resources/Meta-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("/say-hello-jsp")
		public String sayHelloJsp() {
		return "sayHello";
	}
	

}
