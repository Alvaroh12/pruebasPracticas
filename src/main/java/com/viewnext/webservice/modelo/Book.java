package com.viewnext.webservice.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
		
		@Id
		private String id;
		private String book;
		
		public Book(String id, String book) {
			this.id = id;
			this.book = book;
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
		
		
		
}
