package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/hello")

public class HelloController {
//	@RequestMapping(value="/hello")
	private String hello(){
	return "hello.html";
	}
}