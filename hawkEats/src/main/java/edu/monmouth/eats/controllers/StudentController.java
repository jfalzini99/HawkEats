package edu.monmouth.eats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.monmouth.eats.dao.StudentRepository;
import edu.monmouth.eats.entities.Student;


@Controller
@RequestMapping("students")
public class StudentController {
	
	
	@Autowired
	StudentRepository studentRepo;
	
	@GetMapping("/new")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@PostMapping("/save")
	public String saveStudent(Model model, Student student) {
		studentRepo.save(student);
		return "redirect:/students/new";
	}

}
