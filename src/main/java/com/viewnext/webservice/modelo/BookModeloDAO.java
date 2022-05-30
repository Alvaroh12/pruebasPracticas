package com.viewnext.webservice.modelo;


public class BookModeloDAO {

	private String id;
	private String book;
	


	public BookModeloDAO(String id, String book) {
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
	
	public BookModeloDAO converter(Book b){
		return new BookModeloDAO(b.getId(), b.getBook());
	}
	
}
