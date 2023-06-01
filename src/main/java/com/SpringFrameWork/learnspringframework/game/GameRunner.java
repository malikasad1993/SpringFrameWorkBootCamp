package com.SpringFrameWork.learnspringframework.game;

public class GameRunner {
	MarioGame marioGame;
	
	//default constructor
	public GameRunner() {}
	//constructor with MarioGame class object
	public GameRunner(MarioGame marioGame) {
		this.marioGame = marioGame;		
	}
	
	public void run() {
		System.out.println("Running game: " +marioGame);
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();
	}

}
