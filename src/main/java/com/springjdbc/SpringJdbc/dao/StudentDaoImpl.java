package com.springjdbc.SpringJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.SpringJdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public int insert(Student s) {
		// inserting data
		String q = "insert into student(rollno,name,cls) values(?,?,?)";
		int r = this.jdbcTemplate.update(q, s.getRollno(), s.getName(), s.getCls());
		return r;
	}

	public int change(Student s) {
		// updating data
		String q = "update student set name = ?, cls=? where rollno=?";
		int r = this.jdbcTemplate.update(q, s.getName(), s.getCls(), s.getRollno());
		return r;
	}

	public int delete(int roll) {
		// delete operation
		String q = "delete from student where rollno=?";
		int r = this.jdbcTemplate.update(q, roll);
		return r;
	}

	public Student getStudent(int roll) {
		String  q = "Select * from student where rollno=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student s = this.jdbcTemplate.queryForObject(q,rowMapper, roll);
		return s;
	}
	
	public List<Student> getAllStudents() {
		String q = "Select * from student";
		List<Student> s = this.jdbcTemplate.query(q,  new RowMapperImpl());
		return s;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
