package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class HelloController {

	@RequestMapping("/hello")
	private String hello() {
		System.out.println("helloをとらえました");
		return "hello.html";
	}

	@RequestMapping("/bravo")
	private String bravo() {
		System.out.println("bravo");
		return "bravo.html";
	}
}