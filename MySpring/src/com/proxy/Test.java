package com.proxy;

public class Test {

	public static void main(String[] args) {
		//从代理类拿产品调用
		MyProxy p = new MyProxy();
		ISayHello h = (ISayHello) p.bind(new SayHello());
		h.helloWord();
	}

}
