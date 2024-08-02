package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole gamingConsole;
	public GameRunner(@Qualifier("SuperContraGameQualifier")GamingConsole gamingConsole) {
		this.gamingConsole=gamingConsole;
	}

	

	public void run() {
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();

	}
	
}
