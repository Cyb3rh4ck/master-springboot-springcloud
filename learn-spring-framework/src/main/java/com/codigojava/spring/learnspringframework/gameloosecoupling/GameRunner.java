package com.codigojava.spring.learnspringframework.gameloosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	// loose coupling

	@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
