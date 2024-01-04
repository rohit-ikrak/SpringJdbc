package com.springjdbc.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.SpringJdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setRollno(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setCls(rs.getInt(3));
		return s;
	}
	
}
