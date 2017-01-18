package com.kyamaji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping( value="/greeting.html")
	public String sayHello(Model model)
	{
    	model.addAttribute("greeting", "hello World hi rishi");
		return "hello";
	}
}
