package ar.com.bateriasmateo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.bateriasmateo.service.AlmacenService;
import ar.com.bateriasmateo.service.BateriaService;

@Controller
public class AlmacenController {

	@Autowired
	AlmacenService almacenService;
	@Autowired
	BateriaService bateriaService;
	
	public AlmacenController(){
		super();
	}
	
	@RequestMapping(value="/almacenes", method = RequestMethod.GET)
	public String almacenList(Model model){
		model.addAttribute("almacenes", almacenService.getAll());
		return "/almacenes";
	}
	@RequestMapping(value="/almacenes/almacen/{id}")
	public String almace(Model model, @PathVariable long id){		
		model.addAttribute("almacen", almacenService.getViewAlmacenDTO(almacenService.getOne(id)));
		
		return "/almacenes/almacen";
	}
}
