package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")

public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		String out = "Hello World From Carol with factorial 13 is " + factorial(13);
		model.addAttribute("message", out);
		return "hello";
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}
