package com.viewnext.webservice.controller;

public class Book {
		
		private String book;
		private String id;
		
		public Book(String book, String id) {
			this.book = book;
			this.id = id;
		}
		
		public String getBook() {
			return book;
		}
		
		public void setBook(String book) {
			this.book = book;
		}
		
		public String getid() {
			return id;
		}
		
		public void setid(String id) {
			this.id = id;
		}
		
}
