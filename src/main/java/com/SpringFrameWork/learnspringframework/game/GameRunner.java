package com.SpringFrameWork.learnspringframework.game;

public class GameRunner {
	private GamingConsole game;
	
	//default constructor
	public GameRunner() {}
	//constructor with MarioGame class object
	public GameRunner(GamingConsole game) {
		this.game = game;		
	}
	
	public void run() {
		System.out.println("Running game: " +game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
