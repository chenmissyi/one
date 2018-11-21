package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{
	//����Ҫ����Ľӿ� ����Ƕ�̬����  ��ʿobject����������������
	Object obj;
	
	//ͨ���˷����󶨴���Ĳ�Ʒ
	public Object bind(Object o){
		obj = o;
		return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
		
	}
	
	//�����ԭ��Ʒ�����ӹ��ܵ�����  �ڴ˷��������
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//ԭ����ִ��ǰ���빦��
		System.out.println("�������ڸ�ʲô��");
		//ִ��ԭ���ҵķ���
		Object result = method.invoke(obj, null);
		//ԭ����ִ��ǰ���빦��
		System.out.println("�������ɧ����");
		return result;
	}
	
}
