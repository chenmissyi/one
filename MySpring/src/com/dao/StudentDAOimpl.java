package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOimpl implements IStudentDAO  {
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#addStudent()
	 */
	@Override
	public void addStudent(){
		System.out.println("������Ӱ���");
	}
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#updateStudent()
	 */
	@Override
	public void updateStudent(){
//		int i= 1/0;
		System.out.println("�����޸İ���");
	}
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#delStudent()
	 */
	@Override
	public void delStudent(){
		System.out.println("����ɾ������");
	}
	
	/* (non-Javadoc)
	 * @see com.dao.IStudentDAO#lookStudent()
	 */
	@Override
	public void lookStudent(){
		System.out.println("����look����");
	}
	
}
