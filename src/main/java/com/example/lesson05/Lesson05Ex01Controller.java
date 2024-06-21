package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/lesson05")
@Controller
public class Lesson05Ex01Controller {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		//List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("파인애플");
		fruits.add("자두");
		fruits.add("오렌지");
		fruits.add("멜론");
		model.addAttribute("fruits", fruits);
		
		//List<Map<String, Object>>
		List<Map<String, Object>> users= new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name","바다");
		user.put("age", 15);
		user.put("hobby","영화보기");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name","태양");
		user.put("age", 20);
		user.put("hobby","게임");
		users.add(user);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
}
