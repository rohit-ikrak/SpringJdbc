package com.springjdbc.SpringJdbc.dao;

import com.springjdbc.SpringJdbc.entities.Student;

public interface StudentDao {
	public int insert(Student s);
	public int change(Student s);
	public int delete(int roll);
}
