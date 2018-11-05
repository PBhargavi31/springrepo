package com.verizon.sju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.verizon.sju.model.Employee;
import com.verizon.sju.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService empService;

	@GetMapping("/listEmps")
	public ModelAndView listEmployees() {
		return new ModelAndView("empList", "emps", empService.listEmployees());
	}

	@GetMapping("/addEmp")
	public ModelAndView addEmployees() {
		return new ModelAndView("addEmp", "emp", new Employee());
	}

	@PostMapping("/addEmp")
	public String doAddEmployees(@ModelAttribute Employee emp) {
		empService.addEmployee(emp);
		return "redirect:/listEmps";
	}

}
