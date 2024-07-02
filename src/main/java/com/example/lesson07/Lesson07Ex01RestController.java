package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RestController
@RequestMapping("/lesson07/ex01")
public class Lesson07Ex01RestController {

	@Autowired
	private StudentBO studentBO;
	
	// C: create
	@GetMapping("/create")
	public StudentEntity create() {
		String name ="바다";
		String phoneNumber = "010-1111-0000";
		String emailString = "aaaa@aaaaa.com";
		String dreamJob ="간호사";
		
		return studentBO.addStudent(name, phoneNumber, emailString, dreamJob);
				
				
	}
	
}
