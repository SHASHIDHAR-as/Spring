package com.in28minutes.learn_spring_framework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {
	
}
record Address(String FirstLine ,String city) {
	
}

@Configuration
public class HelloWorldConfiguration  {
	
	@Bean
	public String name() {
		return "Shashi";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	@Primary
	public Person person() {
		return  new Person("Ravi",20,new Address("Main Street","London"));	
	}
	
	@Bean(name="add2")
	public Address address() {
		return new Address("NR Extension","Chintamani");
	}
	
	@Bean
	public Person person2MethodCall() {
		return  new Person(name(),age(),address());	
	}
	
	@Bean
	public Person person3Parameters(String name,int age,Address add2) {
		return  new Person(name,age,add2);
	}
	
	
}
