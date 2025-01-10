package com.codigojava.spring.learnspringframework.gametightlycoupled;

public class GameRunner {
	//tightly coupled
	
	private MarioGame game;

	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
