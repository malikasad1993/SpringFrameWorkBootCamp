package com.SpringFrameWork.learnspringframework;

import com.SpringFrameWork.learnspringframework.game.GameRunner;
import com.SpringFrameWork.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
