package com.springjdbc.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.SpringJdbc.dao.StudentDao;
import com.springjdbc.SpringJdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start..." );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springjdbc/SpringJdbc/jdbc_config.xml");
               
        StudentDao sDao = con.getBean("sdao", StudentDao.class);
        
        

//      Insert data
//        Student s = new Student();
//        s.setRollno(4);
//        s.setName("Aman");
//        s.setCls(11);
//        int result = sDao.insert(s);
//        System.out.println("number of records inserted = " + result);
        

//      Update data
//        Student s = new Student();
//        s.setCls(12);
//        s.setName("Rohit");
//        s.setRollno(1);
//        int result = sDao.change(s);
//        System.out.println("number of records updated = " + result);

        
//		Delete data
//        int result = sDao.delete(2);
//        System.out.println("deleted " + result);
        
//        Select Data
//        Student st = sDao.getStudent(1);
//        System.out.println(st);
      
//        Select all data
//        List<Student> student = sDao.getAllStudents();
//        for(Student stud : student) {
//        	System.out.println(stud);
//        }
    }
}
