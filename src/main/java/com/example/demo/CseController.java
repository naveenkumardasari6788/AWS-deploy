package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/5f9")
	public String disk() {
		return "This is Naveen Kumar";
	}
	@GetMapping("/naveen")
		public String disk1() {
			return "This is Naveen(23MH1A05F9)";
		}
}
