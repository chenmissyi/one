package com.proxy;

public class Test {

	public static void main(String[] args) {
		//�Ӵ������ò�Ʒ����
		MyProxy p = new MyProxy();
		ISayHello h = (ISayHello) p.bind(new SayHello());
		h.helloWord();
	}

}
