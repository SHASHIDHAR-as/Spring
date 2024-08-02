package com.in28minutes.learn_spring_framework.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;





@Component
class Shashidhar{
//	@Autowired
	Dependency1 d1;
	
//	@Autowired
	Dependency2 d2;

//	@Autowired
//	public void setD1(Dependency1 d1) {
//		this.d1 = d1;
//	}
//
//	
//	@Autowired
//	public void setD2(Dependency2 d2) {
//		this.d2 = d2;
//	}

	
	
	public String toString() {
		return "Using "+ d1 +"and  "+d2;
	}
	
	@Autowired
	public Shashidhar(Dependency1 d1, Dependency2 d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}
	
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependencyInjection_application {
	

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext
				              (DependencyInjection_application.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
			System.out.println(context.getBean(Shashidhar.class));
		}

		
	}



}