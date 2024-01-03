package com.springjdbc.SpringJdbc.entities;

public class Student {
	private int rollno;
	private String name;
	private int cls;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, int cls) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.cls = cls;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cls=" + cls + "]";
	}
	
}