package com.viewnext.webservice.components;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.viewnext.webservice.modelo.Book;

@Component("booksComponents")
public class booksComponents {

	public ArrayList<Book> add (String parameter, int cont, ArrayList <Book> listaLibros){
		Book book = new Book(parameter, cont+"");
		listaLibros.add(book);
		return listaLibros;
	}
	
	public ArrayList<Book> listById(String parameter, ArrayList <Book> listaLibros) {
		ArrayList<Book> listar = new ArrayList<>();
		
		for (int i = 0; i < listaLibros.size(); i++) {
			if (parameter.equals(listaLibros.get(i).getid())) {
				listar.add(listaLibros.get(i));
			}	
		}
		return listar;
	}
	
	public ArrayList<Book> delete(String id, ArrayList <Book> listaLibros) {
		for (int i = 0; i < listaLibros.size(); i++) {
			if (id.equals(listaLibros.get(i).getid())) {
				listaLibros.remove(i);
			} 
		}
		return listaLibros;
	}
	
	public ArrayList<Book> update(String id, String parameter, ArrayList <Book> listaLibros) {
		for (int i = 0; i < listaLibros.size(); i++) {
			if (id.equals(listaLibros.get(i).getid())) {
				listaLibros.get(i).setBook(parameter);
			} else {

			}
		}
		return listaLibros;
	}

	
	
}
