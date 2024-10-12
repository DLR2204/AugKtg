package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);
	
		Person person = (Person) factory.getBean("per");
	
		person.setPid(100);
		
		person.setPincode(234232);
		
		person.setPname("Sasank");
		
		System.out.println(person);
		
		
	
		
	}
	

}
