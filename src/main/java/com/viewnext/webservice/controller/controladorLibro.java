package com.viewnext.webservice.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.webservice.components.booksComponents;
import com.viewnext.webservice.controller.Book;

@RestController()
@RequestMapping("libro")
public class controladorLibro {

	ArrayList <Book> listaLibros = new ArrayList<Book>();
	int cont = 0;
	
	@Autowired
	@Qualifier("booksComponents")
	private booksComponents bookComponent;
	
	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> aniadir (@RequestBody String parameter){
		return bookComponent.add(parameter, cont++, listaLibros);
	}
	
	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> listar (){
		return listaLibros;
	}
	
	@GetMapping(value = "/{parameter}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> listarId(@PathVariable String parameter){
		return bookComponent.listById(parameter, listaLibros) ;
	}
	
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> borrar(@PathVariable String id) {
		return bookComponent.delete(id, listaLibros);
		}
	
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> modificar(@PathVariable String id, @RequestBody String parameter) {
		return bookComponent.update(id, parameter, listaLibros);
		}
}

