package com.dm.spring.helloWorld;

public class HelloWorld {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println("Hello:"+name);
	}
}
