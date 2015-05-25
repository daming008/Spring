package com.dm.spring.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("configuration.xml");
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		helloWorld.say();
	}
}
