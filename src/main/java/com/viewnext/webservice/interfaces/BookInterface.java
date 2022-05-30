package com.viewnext.webservice.interfaces;

import java.util.List;
import java.util.Map;

import com.viewnext.webservice.modelo.Book;
import com.viewnext.webservice.modelo.BookModeloDAO;

public interface BookInterface {
	
	public List<Map<String, Object>> listar();
	public List<Map<String, Object>> listar(String id);
	public int add(Book b);
	public int edit(Book b);
	public int delete(String id);
	
}
