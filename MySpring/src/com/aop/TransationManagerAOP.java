package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransationManagerAOP {
	/**
	 * ��ʾ�ڷ���ִ��ǰ����
	 * execution ���ʽ�Ǹ���spring �����������
	 * ��һ��*��ʾ�������ص�����
	 * �ڶ�*��ʾ�ð�·���µ�������
	 * ������*��ʾ���������еķ���
	 * (..)��ʾ�����������
	 */
	@Before("execution(* com.dao.*.*(..))")
	public void before(){
		System.out.println("���˳���");
	}
	/**
	 * ��ʾ�ڷ���ִ�к�����
	 * "execution ���ʽ�Ǹ���spring�����������
	 * ��һ��*�Ǳ�ʾ�÷������ص�����
	 * �ڶ���*�Ǳ�ʾ �ð�·�������е���
	 * ������*�Ǳ�ʾ ������  ���еķ���
	 * (..)�Ǳ�ʾ�÷����� �������͵Ĳ���
	 */
	@After("execution(* com.dao.*.*(..))")
	public void after(){
		System.out.println("���˵�����");
	}
	/**
	 * ǰ������
	 * 
	 * @param pjp
	 */
	@Around("execution(* com.dao.*.*(..))")
	public void around(ProceedingJoinPoint pjp){
		System.out.println("���˳���1");
		try {
			pjp.proceed();//ִ��ԭ����
		} catch (Throwable e) {
			System.out.println("ҵ�����쳣"+e.getMessage());
			System.out.println("����ع�");
			e.printStackTrace();
			return;
		}
		System.out.println("���˵�����1");
	}
}
















