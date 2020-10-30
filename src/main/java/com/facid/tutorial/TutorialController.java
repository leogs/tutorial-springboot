package com.facid.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {

	@GetMapping("/bemvindo")
	public String retornaBemvindo() {
		return "Bem vindo ao meu site";
	}
}
