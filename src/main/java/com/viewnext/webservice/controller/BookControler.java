package com.viewnext.webservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.webservice.modelo.Book;
import com.viewnext.webservice.service.BookService;

@RestController
@RequestMapping("books")
public class BookControler {

	@Autowired
	BookService service;
	
	@GetMapping("")
	public List<Map<String, Object>>listar(){
		return service.listar();
	}
	
	@GetMapping("{id}")
	public List<Map<String, Object>>listar(@PathVariable String id){
		return service.listar(id);
	}
	
	
	@PostMapping("")
	public String save(@RequestBody Book p) {
		int id=service.add(p);
		if(id==0) {
			return "No se pudo Regsitrar!";
		}
		return "Se registró con éxito!";
	}
	
	@PutMapping("/{id}")
	public String save(@RequestBody Book p,@PathVariable String id) {
		p.setId(id);
		int r=service.edit(p);
		if(r==0) {
			return "No se pudo Actualizar!";
		}
		return "Se actualizó con éxito!";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable String id) {
		int r=service.delete(id);
		if(r==0) {
			return "Registro No Eliminado!";
		}
		return "Registro Eliminado!";
	}
	
}
