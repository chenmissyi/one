package com.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		1.传统方法
//		StudentService stuSer = new StudentService();
//		stuSer.addStudent();
//		2.通过Spring 获取Javabean对象的 容器   先获取容器 再获取bean 对象
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		StudentService stuSer = (StudentService) bf.getBean("studentService");
		stuSer.addStudent();
	}
}
