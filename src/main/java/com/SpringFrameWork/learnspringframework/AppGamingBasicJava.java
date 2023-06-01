package com.SpringFrameWork.learnspringframework;

import com.SpringFrameWork.learnspringframework.game.GameRunner;
import com.SpringFrameWork.learnspringframework.game.MarioGame;
import com.SpringFrameWork.learnspringframework.game.PacMan;
import com.SpringFrameWork.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var pacMan = new PacMan();
		var superContraGame = new SuperContraGame();
		var marioGame = new MarioGame();
		var gameRunner1 = new GameRunner(pacMan);
		var gameRunner2 = new GameRunner(superContraGame);
		var gameRunner3 = new GameRunner(marioGame);
		gameRunner1.run();
		gameRunner2.run();
		gameRunner3.run();

	}

}
