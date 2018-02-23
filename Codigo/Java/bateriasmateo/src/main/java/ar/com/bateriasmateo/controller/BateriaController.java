package ar.com.bateriasmateo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.bateriasmateo.domain.Bateria;
import ar.com.bateriasmateo.service.AlmacenService;
import ar.com.bateriasmateo.service.BateriaEstadoService;
import ar.com.bateriasmateo.service.BateriaService;
import ar.com.bateriasmateo.service.BateriaTipoService;

@Controller
public class BateriaController {
	
	@Autowired
	BateriaService bateriaService;
	@Autowired
	AlmacenService almacenService;
	@Autowired
	BateriaTipoService bateriaTipoService;
	@Autowired
	BateriaEstadoService bateriaEstadoService;
	
	public BateriaController(){
		super();
	}
	
	@RequestMapping(value = "/baterias", method = RequestMethod.GET )
	public String bateriaslist(Model model){
		model.addAttribute("baterias", bateriaService.getAll());
	return "baterias/bateria/bateriasList";
	}
	@RequestMapping(value ="baterias/bateria/view/{id}")
	public String bateria(Model model, @PathVariable Long id){
		model.addAttribute("bateria", bateriaService.getOne(id));
		return "baterias/bateria/bateria";
	}
	
	
	@RequestMapping(value ="baterias/bateria/view/almacen{id}")	
	public String bateriasByAlmacen(Model model, @PathVariable Long AlmacenId){
		model.addAttribute("bateria", bateriaService.getByAlmacen(AlmacenId));
		return "baterias/bateria/bateriasList";
	}	
	
	
	@RequestMapping(value="baterias/bateria/new")
	public String nuevaBateria(Model model){
		model.addAttribute("bateria", new Bateria());
		model.addAttribute("almacenes", almacenService.getAll());
		model.addAttribute("tipos", bateriaTipoService.getAll());
		model.addAttribute("estados", bateriaEstadoService.getAll());
		return "baterias/bateria/bateria";
	}
	@RequestMapping(value = "/baterias", method = RequestMethod.POST )
	public String save(@Valid @ModelAttribute("bateria") Bateria bateria, BindingResult bindingResult, Model model){
		if((bindingResult.hasErrors())){
			model.addAttribute("bateria", bateria);
			return "redirect:/baterias";
		}
		else
			bateriaService.save(bateria);
			return "baterias/bateria/newBateriaOK";
	}
	@RequestMapping(value="/baterias/bateria/edit/{id}")
	public String editBateriaView(Model model, @PathVariable Long id ){
		Bateria bateria = bateriaService.getOne(id);
		model.addAttribute("bateria", bateria);
		model.addAttribute("almacenes", almacenService.getAll());
		model.addAttribute("tipos", bateriaTipoService.getOne(bateria.getBateriaTipo().getId()));
		model.addAttribute("estados", bateriaEstadoService.getAll());
	return "baterias/bateria/bateria";
	}
	@RequestMapping(value="/baterias/bateria/delete/{id}")
	public String deleteBateriaView(Model model, @PathVariable Long id){
		Bateria bateriaDelete = bateriaService.getOne(id);
		bateriaService.delete(bateriaDelete);
	return "redirect:baterias";
	}
	
	

}
