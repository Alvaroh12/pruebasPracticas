package com.viewnext.webservice.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.webservice.interfaces.BookInterface;
import com.viewnext.webservice.modelo.Book;
import com.viewnext.webservice.modeloDAO.BookDAO;

@Service
public class BookService implements BookInterface{

	@Autowired
	BookDAO dao;

	@Override
	public List<Map<String, Object>> listar() {
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Book b) {
		// TODO Auto-generated method stub
		return dao.add(b);
	}

	@Override
	public int edit (Book b) {
		// TODO Auto-generated method stub
		return dao.edit(b);
	}

	@Override
	public int delete(String id) {
		return dao.delete(id);
	}
}
