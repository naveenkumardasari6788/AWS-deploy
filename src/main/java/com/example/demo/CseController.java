package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/home")
	public String disk() {
		return "Welcome to the Cse Jenkins ghghghghg";
	}
	@GetMapping("/cse")
		public String disk1() {
			return "Welcome to the Aditya";
		}
}
