package com.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		1.��ͳ����
//		StudentService stuSer = new StudentService();
//		stuSer.addStudent();
//		2.ͨ��Spring ��ȡJavabean����� ����   �Ȼ�ȡ���� �ٻ�ȡbean ����
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		StudentService stuSer = (StudentService) bf.getBean("studentService");
		stuSer.addStudent();
	}
}
