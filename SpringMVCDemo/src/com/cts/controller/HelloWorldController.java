package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
//	@RequestMapping(  "/hello")
	@RequestMapping(value = "/hello" ,method = RequestMethod.GET)
	public String sayHello() {
		 return "helloworld";
	}
	
	@RequestMapping("/hello_spring")
	public String helloSpring() {
		return "welcome_spring";
	}

}
