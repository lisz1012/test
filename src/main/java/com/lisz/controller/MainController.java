package com.lisz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/test")
	public String test() {
		return "test, haha,!update to show LB！update, only for host2";
	}
}
