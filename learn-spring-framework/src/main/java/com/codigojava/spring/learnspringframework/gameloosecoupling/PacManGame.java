package com.codigojava.spring.learnspringframework.gameloosecoupling;

public class PacManGame implements GamingConsole {

	public void up() {
		System.out.println("Pacman jump");
	}

	public void down() {
		System.out.println("Pacman down");
	}

	public void left() {
		System.out.println("Pacman left");
	}

	public void right() {
		System.out.println("Pacman right");
	}

}
