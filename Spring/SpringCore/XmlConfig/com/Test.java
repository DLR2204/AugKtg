package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("hello.xml");
//		
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("hello.xml");
		
		System.out.println(factory.getBean("emp"));
		
	}

}
