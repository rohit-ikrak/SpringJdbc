package com.springjdbc.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.SpringJdbc.dao.StudentDao;
import com.springjdbc.SpringJdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start..." );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springjdbc/SpringJdbc/jdbc_config.xml");
               
        StudentDao sDao = con.getBean("sdao", StudentDao.class);
        
        Student s = new Student();
//        s.setRollno(2);
//        s.setName("Dikshant");
//        s.setCls(11);
//        int result = sDao.insert(s);
        
//        s.setCls(12);
//        s.setName("Rohit");
//        s.setRollno(1);
//        int result = sDao.change(s);
        System.out.println("number of records inserted = " + result);
        
    }
}
