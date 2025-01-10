package com.codigojava.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codigojava.spring.learnspringframework.gameloosecoupling.GameRunner;
import com.codigojava.spring.learnspringframework.gameloosecoupling.GamingConsole;
import com.codigojava.spring.learnspringframework.gameloosecoupling.MarioGame;
import com.codigojava.spring.learnspringframework.gameloosecoupling.PacManGame;
import com.codigojava.spring.learnspringframework.gameloosecoupling.SuperContraGame;



@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context 
			= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		
		//llamando solo a la interface
//		GamingConsole game = new MarioGame(); //1
//		GameRunner runner = new GameRunner(game);  //2
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();
		
		
	}

}
