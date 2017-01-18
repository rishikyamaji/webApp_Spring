package com.kyamaji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyamaji.model.Exercise;

@Controller
public class AddMinuts {
	@RequestMapping (value=("/addMinuts"))
	public String addMinuts(@ModelAttribute("exercise") Exercise exercise)
	{
		System.out.printf("exercise: %d",exercise.getMinutes());
		return "addMinuts";
	}

}
