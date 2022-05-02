package com.cts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value="/login" ,method = RequestMethod.POST)
	public String validateLogin(HttpServletRequest request,Model m) {
		String m_user=request.getParameter("username");
		String m_pass= request.getParameter("password");
		String message=null;
		if(m_user.equals("admin") && m_pass.equals("admin")) {
			
			message="Wel-Come "+m_user;
			m.addAttribute("msgObj", message);
			return "success";
		}else {
			message="Sorry ! username/password not valid";
			m.addAttribute("msgObj", message);
		    return "error";	
		}
		
		
		
	}
	
}
