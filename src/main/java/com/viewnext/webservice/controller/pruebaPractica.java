package com.viewnext.webservice.controller;

import java.awt.print.Book;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("hello")
public class pruebaPractica {

	@GetMapping(value = "/{parameter}", produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Book hello(@PathVariable String parameter) {
		
		Book book = new Book(parameter, "prueba3");
		
		return book;
	}
	
	public class Book{
		
		private String book;
		private String other;
		
		public Book(String book, String other) {
			this.book = book;
			this.other = other;
		}
		
		public String getBook() {
			return book;
		}
		
		public void setBook(String book) {
			this.book = book;
		}
		
		public String getOther() {
			return other;
		}
		
		public void setOther(String other) {
			this.other = other;
		}
		
		
		
	}
}
