package com.viewnext.webservice.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.webservice.controller.Book;

@RestController()
@RequestMapping("aniadir")
public class aniadirLibros {
	
	ArrayList <Book> listaLibros = new ArrayList<Book>();
	int cont = 0;
	
	//@GetMapping(value = "/{parameter}", produces = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	
public ArrayList<Book> aniadir(@RequestBody String parameter) {
		
		Book book = new Book(parameter, cont+"");
		cont++;
		listaLibros.add(book);
		return listaLibros;
	}
	
	@RestController()
	@RequestMapping("listar")
	public class listarLibros{		
		@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
		public ArrayList<Book> listar() {
				return listaLibros;
			}
	}
	
	@RestController()
	@RequestMapping("listarId")
	public class listarLibrosId{		
		
		@GetMapping(value = "/{parameter}", produces = MediaType.APPLICATION_JSON_VALUE)
		
		public ArrayList<Book> listarId(@PathVariable String parameter) {
			
			ArrayList<Book> listar = new ArrayList<>();
			
			for (int i = 0; i < listaLibros.size(); i++) {
				if (parameter.equals(listaLibros.get(i).getid())) {
					listar.add(listaLibros.get(i));
				} else {

				}
		}
				return listar;
			}
	}
	
	@RestController()
	@RequestMapping("eliminar")
	public class eliminarLibros{		
		
		@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		
		public ArrayList<Book> borrar(@PathVariable String id) {
			
			for (int i = 0; i < listaLibros.size(); i++) {
				if (id.equals(listaLibros.get(i).getid())) {
					listaLibros.remove(i);
				} 
			}
			
			return listaLibros;
			}
		
		@RestController()
		@RequestMapping("modificar")
		public class modificarLibros{		
			
			@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
			
			public ArrayList<Book> modificar(@PathVariable String id, @RequestBody String parameter) {
				
				for (int i = 0; i < listaLibros.size(); i++) {
					if (id.equals(listaLibros.get(i).getid())) {
						listaLibros.get(i).setBook(parameter);
					} else {

					}
				}
				
				return listaLibros;
				}

	}

}

}