package com.springjdbc.SpringJdbc.dao;

import java.util.List;

import com.springjdbc.SpringJdbc.entities.Student;

public interface StudentDao {
	public int insert(Student s);
	public int change(Student s);
	public int delete(int roll);
	public Student getStudent(int roll);
	public List<Student> getAllStudents();
}
