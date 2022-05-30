package com.viewnext.webservice.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
		
		@Id
		private String id;
		private String book;
		private String descripcion;
		
		public Book(String id, String book, String descripcion) {
			this.id = id;
			this.book = book;
			this.descripcion = descripcion;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBook() {
			return book;
		}

		public void setBook(String book) {
			this.book = book;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
		
		
		
}
