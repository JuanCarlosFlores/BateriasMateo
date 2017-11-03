package ar.com.bateriasmateo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.com.bateriasmateo.service.EstacionService;

@Controller
public class EstacionController {
	
	@Autowired
	EstacionService estacionService;

}
