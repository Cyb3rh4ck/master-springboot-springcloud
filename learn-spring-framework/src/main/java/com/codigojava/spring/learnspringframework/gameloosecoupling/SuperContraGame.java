package com.codigojava.spring.learnspringframework.gameloosecoupling;

public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("SuperContraGame jump");
	}

	public void down() {
		System.out.println("SuperContraGame down");
	}

	public void left() {
		System.out.println("SuperContraGame left");
	}

	public void right() {
		System.out.println("SuperContraGame right");
	}

}
