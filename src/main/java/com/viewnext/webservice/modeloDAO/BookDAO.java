package com.viewnext.webservice.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.viewnext.webservice.interfaces.BookInterface;
import com.viewnext.webservice.modelo.Book;

@Repository
public class BookDAO implements BookInterface{

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("SELECT * FROM libro");
		return list;
	}

	@Override
	public List<Map<String, Object>> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Book p) {
		String sql = "insert into libro (id,book)values(?,?)";
		return template.update(sql, p.getId(), p.getBook());
	}

	@Override
	public int edit(Book b) {
		String sql="update libro set book=? where id=?";		
		return template.update(sql,b.getBook(),b.getId());
	}

	@Override
	public int delete(String id) {
		String sql="delete from libro where id=?";
		return template.update(sql,id);
	}

	
}
