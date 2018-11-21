package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOMysqlimpl implements IStudentDAO {

	@Override
	public void addStudent() {
		System.out.println("zai?");

	}

	@Override
	public void updateStudent() {
		System.out.println("zai!");
		
	}

	@Override
	public void delStudent() {
		System.out.println("zaiganma?");
	}

	@Override
	public void lookStudent() {
		System.out.println("en!");
		
	}

}
