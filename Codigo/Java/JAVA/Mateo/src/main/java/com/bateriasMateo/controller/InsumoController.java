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

import com.bateriasMateo.domain.Insumo;
import com.bateriasMateo.service.InsumoService;


@Controller
public class InsumoController {

	@Autowired
	InsumoService InsumoService;
	
	public InsumoController () {
		super();
	}
	
	@RequestMapping(value = "/insumos", method = RequestMethod.GET )
	public String list(Model model){
		model.addAttribute("insumos", InsumoService.getAll());	
		return "insumo/insumoList";
	}
	
	@RequestMapping(value = "/insumo/{id}")
	public String insumos(Model model, @PathVariable Long id ) {
		model.addAttribute("insumo", InsumoService.get(id));
		return "insumo/insumo";
	}
	
	@RequestMapping(value="/insumo/new")
	public String add(Model model){
		model.addAttribute("insumo", new Insumo());
	return "insumo/insumo";	
	}
	
	@RequestMapping(value="/insumos", method= RequestMethod.POST)
	public String save(@Valid @ModelAttribute("Insumo") Insumo insumo, BindingResult bindingResult, Model model){
		if ((bindingResult.hasErrors())) {
			model.addAttribute("insumo", insumo);			
			return "insumo/nuevoInsumoOK";
		}else{
			InsumoService.save(insumo);
			return "redirect:/insumos";
		}
	}
	
	@RequestMapping(value="/insumo/edit/{id}")
	public String update(Model model, @PathVariable Long id){
		Insumo insumo = InsumoService.get(id);
		model.addAttribute("insumo", insumo);	
		return "insumo/insumo";		
	}
	
	
	@RequestMapping(value="insumo/delete/{id}")
	public String delete(Model model, @PathVariable Long id){
		Insumo insumo = InsumoService.get(id);
		InsumoService.delete(insumo);
		return "redirect:/insumos";
	}
	
}
