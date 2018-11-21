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
	 * 表示在方法执行前切入
	 * execution 表达式是告诉spring 切入点在那了
	 * 第一个*表示方法返回的类型
	 * 第二*表示该包路径下的所有类
	 * 第三个*表示该类中所有的方法
	 * (..)表示任意参数类型
	 */
	@Before("execution(* com.dao.*.*(..))")
	public void before(){
		System.out.println("阿浪出生");
	}
	/**
	 * 表示在方法执行后切入
	 * "execution 表达式是告诉spring切入点在哪里
	 * 第一个*是表示该方法返回的类型
	 * 第二个*是表示 该包路径下所有的类
	 * 第三个*是表示 该类中  所有的方法
	 * (..)是表示该方法中 所有类型的参数
	 */
	@After("execution(* com.dao.*.*(..))")
	public void after(){
		System.out.println("阿浪的死亡");
	}
	/**
	 * 前后切入
	 * 
	 * @param pjp
	 */
	@Around("execution(* com.dao.*.*(..))")
	public void around(ProceedingJoinPoint pjp){
		System.out.println("阿浪出生1");
		try {
			pjp.proceed();//执行原方法
		} catch (Throwable e) {
			System.out.println("业务发生异常"+e.getMessage());
			System.out.println("事务回滚");
			e.printStackTrace();
			return;
		}
		System.out.println("阿浪的死亡1");
	}
}
















