package com.cts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.model.Calculator;

@Controller
public class CalculatorController {
	@RequestMapping(value="/addNumber", method=RequestMethod.POST)
	public String calculate(HttpServletRequest request,Model model) {
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int result=num1+num2;
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);
		model.addAttribute("resObj",result);
		return "result";
	}

	@RequestMapping(value="/calciForm", method=RequestMethod.GET)
	public String getCalculatrForm(Model model) {
		Calculator calculator=new Calculator();
		model.addAttribute("calObj",calculator);
		return  "newcalculator";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String newCalculate(@ModelAttribute("calObj") Calculator cal,Model model) {
		int num1=cal.getNum1();
		int num2=cal.getNum2();
		int result=num1+num2;
		cal.setResult(result);
		model.addAttribute("calci",cal);
		return "newresult";
	}
}
