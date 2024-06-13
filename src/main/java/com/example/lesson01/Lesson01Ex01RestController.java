package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // @Controller + @ResponseBody, spring bean
public class Lesson01Ex01RestController {
	
	// http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>@RestController를 사용해서 String을 리턴한다.</h3>";
	}
	
	@RequestMapping("/4")
	public Map<String, String> ex01_4(){
		Map<String, String> map = new HashMap<>();
		map.put("김바다", "111");
		map.put("김바", "222");
		map.put("김", "333");
		return map;
	}
	
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data();//java bean
		data.setId(100);
		data.setName("한주형");
		
		return data;
	}
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data();//java bean
		data.setId(100);
		data.setName("한주형");
		
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
