package com.cts.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value="/addEmployee")
	public String getEmpForm(Model model) {
		Employee emp=new Employee();
		model.addAttribute("empObj",emp);
		return "employeeForm";
	}
	
	@RequestMapping(value="/sumbitData", method=RequestMethod.POST)
	public String submitForm( @Valid @ModelAttribute("empObj") Employee emp, BindingResult br, ModelMap modelMap) {
		System.out.println(1);
		if(br.hasErrors()) {
			return "employeeForm";
		}
		else {
			modelMap.addAttribute("empObj",emp);
			return "success";
		}
		
	}
}