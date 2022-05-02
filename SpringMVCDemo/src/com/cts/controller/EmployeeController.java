package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/addEmployee")
	
	public String getEmpFrom(Model model) {
	    Employee employee = new Employee();
	    model.addAttribute("empObj",employee);
		return "employeeForm";
		
	}
	
	
	@RequestMapping(value="/submitData", method=RequestMethod.POST)
	
	public String readData(@ModelAttribute("empobj") Employee e, ModelMap modelMap) {
		
		modelMap.addAttribute("m_empno",e.getEmpNo());
		modelMap.addAttribute("m_name",e.getName());
		modelMap.addAttribute("m_salary",e.getSalary());
		return "newsuccess";
	}
	
}
