package com.bateriasMateo.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bateriasMateo.domain.Bateria;

import com.bateriasMateo.service.BateriaService;


@RestController
public class ResultRest {
	
	private BateriaService bateriaService;
	@Autowired
	public ResultRest(BateriaService p_bateriaService){
		this.bateriaService= p_bateriaService;
	}
	
	@RequestMapping(path="/baterias/rest/all", method =RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Bateria>> getBaterias(){
		List<Bateria> baterias= bateriaService.getAll();	
		return new ResponseEntity<List<Bateria>>(baterias, HttpStatus.OK);
	}
		
	@RequestMapping(path="/baterias/rest/{id}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bateria> getBateria(@PathVariable long id )
	{
		Bateria bateria = bateriaService.get(id);
		if(bateria==null)
			return new ResponseEntity<Bateria>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Bateria>(bateria, HttpStatus.OK);	
	}
	
}
