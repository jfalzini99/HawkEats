package edu.monmouth.eats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.monmouth.eats.dao.EmployeeRepository;
import edu.monmouth.eats.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@GetMapping("/new")
	public String newEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(Model model, Employee employee) {
		employeeRepo.save(employee);
		return "redirect:/employees/new";
	}

}
