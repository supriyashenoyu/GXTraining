package com.galaxe.sbfirstapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	@RequestMapping("home")
	//@RequestBody
	public String home() {
		return "home.jsp";
		
	}
}

