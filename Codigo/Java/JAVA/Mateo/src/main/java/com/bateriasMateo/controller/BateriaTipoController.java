package com.bateriasMateo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bateriasMateo.domain.Bateria;
import com.bateriasMateo.domain.BateriaTipo;
import com.bateriasMateo.service.BateriaService;
import com.bateriasMateo.service.BateriaTipoService;


@Controller
public class BateriaTipoController {

	@Autowired
	BateriaTipoService bateriaTipoService;
	
	public BateriaTipoController(){
		super();
	}
	@RequestMapping(value="/baterias/tipos", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("bateriaTipo", bateriaTipoService.getAll());
		return "/bateria/bateriaTipos";
	}
	@RequestMapping(value="bateria/tipo/{id}")
	public String bateriaTipo(Model model, @PathVariable Long id){
		model.addAttribute("bateriaTipo",bateriaTipoService.get(id));
		return "/bateria/bateriaTipo";
	}
	@RequestMapping(value="/bateria/tipo/new")
	public String newBateriaTipoView(Model model){
		model.addAttribute("bateriaTipo", new BateriaTipo());
	return "bateria/bateriaTipo";	
	}
	@RequestMapping(value="/baterias/tipos", method= RequestMethod.POST)
	public String save(@Valid @ModelAttribute("bateriaTipo") BateriaTipo bateriaTipo, BindingResult BindingResult, Model model){
		if((BindingResult.hasErrors())){
			model.addAttribute("bateriaTipo", bateriaTipo);
			return "redirect: /bateria/bateriaTipos";
		}
		else{
			bateriaTipoService.save(bateriaTipo);
			return "/bateria/bateriaTipos";
		}		
	}
	@RequestMapping(value="baterias/tipo/edit/{id}")
	public String updateBateriaTipoView(Model model, @PathVariable long id){
		BateriaTipo bateriaTipo = bateriaTipoService.get(id);
		model.addAttribute("bateriaTipo", bateriaTipo);
		return "bateria/bateriaTipo";
	}
	@RequestMapping(value="baterias/tipo/delete/{id}")
	public String deleteBateriaTipoView(Model model, @PathVariable long id){
		BateriaTipo bateriaTipo = bateriaTipoService.get(id);
		bateriaTipoService.delete(bateriaTipo);
		return "bateria/bateriaTipos";
	}
}
