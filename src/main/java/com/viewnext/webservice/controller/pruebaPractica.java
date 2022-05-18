package com.viewnext.webservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.webservice.modelo.Book;


@RestController()
@RequestMapping("hello")
public class pruebaPractica {

	@GetMapping(value = "/{parameter}", produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Book hello(@PathVariable String parameter) {
		
		Book book = new Book(parameter, "prueba");
		
		return book;
	}
}
