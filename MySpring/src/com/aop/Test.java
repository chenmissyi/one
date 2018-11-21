package com.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.IStudentDAO;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		IStudentDAO stuDAO = (IStudentDAO) bf.getBean("studentDAOimpl");
		stuDAO.updateStudent();
		
		

	}

}
