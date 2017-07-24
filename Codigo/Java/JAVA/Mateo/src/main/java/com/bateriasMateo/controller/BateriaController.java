package com.bateriasMateo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bateriasMateo.service.BateriaService;



@Controller
public class IndexController {
	
	@Autowired
	BateriaService bateriaService;
	
	public IndexController(){
		super();
	}
	
	@RequestMapping(value = "/")
	public String index() {
		return "home";
	}
	
	@RequestMapping(value = "/baterias/{id}")
	public String baterias(Model model, @PathVariable Long id ) {
		model.addAttribute("bateria", bateriaService.get(id));
		return "bateria/bateria";
	}


}
