package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//html 화면으로 보내는 컨트롤러
@Controller // @ResponseBody가 있으면 안됨!! @RestController X
public class Lesson01Ex02Controller {

	// http://localhost/lesson01/ex03
	@RequestMapping("/lesson01/ex03")
	public String ex03() {
		// return 되는 String은 html의 경로이다.(@ResponseBody 없을 때)
		
		//        /templates/             .html
		//return "/templates/lesson01/ex03.html";
		return "lesson01/ex02"; // response html view 경로
	}
}
