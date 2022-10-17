package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String register() {
		return "student_register";
	}
	
	@PostMapping("/register")
	public String processStudent(Map<String, Object> map, @ModelAttribute Student student) {
		String result = null;
		if(student.getAvg()>=60)
			result = "First Division";
		else if(student.getAvg()>=50)
			result = "Second Division";
		else if(student.getAvg()>=30)
			result = "Third Division";
		else
			result = "Failed";
		map.put("sno", student.getSno());
		map.put("name", student.getSname());
		map.put("addrs", student.getSadd());
		map.put("result", result);
		return "show_result";
	}

}
