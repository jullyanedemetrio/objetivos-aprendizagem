package com.objetivosaprendizagem.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivosAprendizagem() {
		return "Meu objetivo de aprendizagem para essa semana é entender o Spring!";
	}

}
