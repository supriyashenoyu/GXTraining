package com.galaxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwiggyController {
	@RequestMapping("/welcome.htm")
	public String displayWelcomePage() {
		return "SwiggyHome";
		
	}

}
