package com.bateriasMateo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bateriasMateo.domain.Bateria;
import com.bateriasMateo.service.BateriaService;



@Controller
public class BateriaController {
	
	@Autowired
	BateriaService bateriaService;
	
	public BateriaController(){
		super();
	}
	
	@RequestMapping(value = "/")
	public String index() {
		return "home";
	}
	
	@RequestMapping(value = "/baterias", method = RequestMethod.GET )
	public String list(Model model){
		model.addAttribute("baterias", bateriaService.getAll());	
		return "bateria/bateriasList";
	}
	
	@RequestMapping(value = "/bateria/{id}")
	public String baterias(Model model, @PathVariable Long id ) {
		model.addAttribute("bateria", bateriaService.get(id));
		return "bateria/bateria";
	}
	@RequestMapping(value="/bateria/new")
	public String newBateriaView(Model model){
		model.addAttribute("bateria", new Bateria());
	return "bateria/bateria";	
	}
	@RequestMapping(value="/baterias", method= RequestMethod.POST)
	public String save(@Valid @ModelAttribute("bateria") Bateria bateria, BindingResult bindingResult, Model model){
		if ((bindingResult.hasErrors())) {
			model.addAttribute("bateria", bateria);			
			return "bateria/newBateriaOK";
		}else{
			bateriaService.save(bateria);
			return "redirect:baterias";
		}
	}
	@RequestMapping(value="/bateria/edit/{id}")
	public String updateBateriaView(Model model, @PathVariable Long id){
		Bateria bateria = bateriaService.get(id);
		model.addAttribute("bateria", bateria);	
		return "bateria/bateria";		
	}
	
	@RequestMapping(value="bateria/delete/{id}")
	public String delete(Model model, @PathVariable Long id){
		Bateria bateria = bateriaService.get(id);
		bateriaService.delete(bateria);
		return "redirect:/baterias";
	}
	
}
