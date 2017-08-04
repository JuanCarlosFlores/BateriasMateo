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

import com.bateriasMateo.domain.MateriaPrima;
import com.bateriasMateo.service.MateriaPrimaService;

@Controller
public class MateriaPrimaController {

	@Autowired
	MateriaPrimaService MateriaPrimaService;

	public MateriaPrimaController() {

	}

	@RequestMapping(value = "/materiasPrima", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("materiasPrima", MateriaPrimaService.getAll());
		return "materiaPrima/materiaPrimaList";
	}

	@RequestMapping(value = "/MateriaPrima/{id}")
	public String MateriasPrima(Model model, @PathVariable Long id) {
		model.addAttribute("materiaPrima", MateriaPrimaService.get(id));
		return "MateriaPrima/MateriaPrima";
	}

	@RequestMapping(value = "/materiaPrima/nueva")
	public String add(Model model) {
		model.addAttribute("materiaPrima", new MateriaPrima());
		return "materiaPrima/materiaPrima";
	}

	@RequestMapping(value = "/materiasPrima", method = RequestMethod.POST)
	public String save(@Valid @ModelAttribute("MateriaPrima") MateriaPrima materiaPrima, BindingResult bindingResult,
			Model model) {
		if ((bindingResult.hasErrors())) {
			model.addAttribute("materiaPrima", materiaPrima);
			return "MateriaPrima/nuevaMateriaPrimaOK";
		} else {
			MateriaPrimaService.save(materiaPrima);
			return "redirect:/MateriasPrima";
		}
	}

	@RequestMapping(value = "/MateriaPrima/editar/{id}")
	public String update(Model model, @PathVariable Long id) {
		MateriaPrima materiaPrima = MateriaPrimaService.get(id);
		model.addAttribute("materiaPrima", materiaPrima);
		return "MateriaPrima/MateriaPrima";
	}

	@RequestMapping(value = "MateriaPrima/delete/{id}")
	public String delete(Model model, @PathVariable Long id) {
		MateriaPrima materiaPrima = MateriaPrimaService.get(id);
		MateriaPrimaService.delete(materiaPrima);
		return "redirect:/MateriasPrima";
	}

}
