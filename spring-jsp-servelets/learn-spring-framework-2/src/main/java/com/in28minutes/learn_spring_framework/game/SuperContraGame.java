package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("UP");	
	}
	public void down() {
		System.out.println("Go down");	
	}
	public void left() {
		System.out.println("Move left");	
	}
	public void right() {
		System.out.println("Jump");	
	}

}
