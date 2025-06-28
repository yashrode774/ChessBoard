package com.example.technogise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnogiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnogiseApplication.class, args);

		Game game = new Game();
		game.startGame();
	}

}
