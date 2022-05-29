package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String handleTest() {
		int a = 40;
		int b = 50;
		int c = 67;
		return "Addition of a and b is : "+(a+b+c);
	}
}
