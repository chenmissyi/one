package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOimpl implements IStudentDAO  {
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#addStudent()
	 */
	@Override
	public void addStudent(){
		System.out.println("正在添加阿浪");
	}
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#updateStudent()
	 */
	@Override
	public void updateStudent(){
//		int i= 1/0;
		System.out.println("正在修改阿浪");
	}
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#delStudent()
	 */
	@Override
	public void delStudent(){
		System.out.println("正在删除阿浪");
	}
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#lookStudent()
	 */
	@Override
	public void lookStudent(){
		System.out.println("正在look阿浪");
	}
	
}
