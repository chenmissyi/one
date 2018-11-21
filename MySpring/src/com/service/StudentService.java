package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.IStudentDAO;

@Service
public class StudentService {
	
	@Autowired
	@Qualifier("studentDAOMysqlimpl")
	IStudentDAO stuDAO;
	
	public void setStuDAO(IStudentDAO stuDAO) {
		this.stuDAO = stuDAO;
	}

	public void addStudent(){
		System.out.println("ÃÌº”∞¢¿À≥…π¶");
		stuDAO.addStudent();
	}
}
