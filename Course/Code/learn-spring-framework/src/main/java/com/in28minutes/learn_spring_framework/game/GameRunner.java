package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
	GamingConsole gamingConsole;
	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole=gamingConsole;
	}

	

	public void run() {
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();

	}
	
}
