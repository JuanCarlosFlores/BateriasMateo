package ar.com.bateriasmateo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.bateriasmateo.service.ProductoIntermedioService;
import ar.com.bateriasmateo.domain.Bateria;
import ar.com.bateriasmateo.domain.Consumible;
import ar.com.bateriasmateo.domain.Insumo;
import ar.com.bateriasmateo.service.InsumoService;
import ar.com.bateriasmateo.service.MateriaPrimaService;

@Controller
public class ConsumibleController {
	
	@Autowired
	MateriaPrimaService materiaPrimaService;
	
	@Autowired
	InsumoService insumoService;
	
	@Autowired
	ProductoIntermedioService productoIntermedioService;
	
	
	public ConsumibleController(){
		super();
	}
	
	@RequestMapping(value="/consumibles", method = RequestMethod.GET)
	public String consumiblesList(Model model){
		
		List<Consumible> target = new ArrayList<Consumible>();	
		
		target.addAll(insumoService.getAll());
		target.addAll(productoIntermedioService.getAll());
		target.addAll(materiaPrimaService.getAll());
		model.addAttribute("consumibles", target);		
		return "consumibles/consumibles";
	}
	
	@RequestMapping(value="/consumibles/insumo", method = RequestMethod.GET)
	public String insumoList(Model model){		
		model.addAttribute("consumibles", insumoService.getAll());	
		return "consumibles/consumibles";
	}

	@RequestMapping(value="/consumibles/productoIntermedio", method = RequestMethod.GET)
	public String productoIntermedioList(Model model){		
		model.addAttribute("consumibles", productoIntermedioService.getAll());	
		return "consumibles/consumibles";
	}

	@RequestMapping(value="/consumibles/materiaPrima", method = RequestMethod.GET)
	public String materiaPrimaList(Model model){		
		model.addAttribute("consumibles", materiaPrimaService.getAll());		
		return "consumibles/consumibles";
	}
	
	
	@RequestMapping(value="/consumibles/consumir/{id}")
	public String editConsumibleView(Model model, @PathVariable Long id ){
		Consumible consumible = null;
		if(materiaPrimaService.getOne(id) == null){
			if(insumoService.getOne(id) == null){
				if(productoIntermedioService.getOne(id) != null){
					consumible = productoIntermedioService.getOne(id);					
				}				
			}else{
				consumible = insumoService.getOne(id);
			}		
		}
		else{
			consumible = materiaPrimaService.getOne(id);
	    };
				
		model.addAttribute("consumible", consumible);
		return "consumibles/consumir";
	}
	
	@RequestMapping(value = "/consumibles/consumir", method = RequestMethod.POST )
	public String editConsumible(@Valid @ModelAttribute("consumible") Consumible consumible, BindingResult bindingResult, Model model){
		if((bindingResult.hasErrors())){
			model.addAttribute("consumible", consumible);
			return "redirect:/consumibles";
		}
		else{}
		return "baterias/bateria/newBateriaOK";
	}
	
}
