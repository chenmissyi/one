package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{
	//声明要代理的接口 如果是动态代理  勇士object类来代替所有类型
	Object obj;
	
	//通过此方法绑定代理的产品
	public Object bind(Object o){
		obj = o;
		return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
		
	}
	
	//代理给原产品做附加功能的切入  在此方法中完成
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//原方法执行前切入功能
		System.out.println("阿浪你在干什么？");
		//执行原厂家的方法
		Object result = method.invoke(obj, null);
		//原方法执行前切入功能
		System.out.println("阿浪你好骚啊！");
		return result;
	}
	
}
