package gui;


import finalAnimation.FinalAnimation;

public class MainPanel {

	public static void setUp() {
		// TODO 自动生成的方法存根
		//set up the main panel,and register some button
		//to listen the request to view 'about us','gameIntroduction'
		//,'achievement','start'etc.
	}

	public static void TimeOver() {
		// TODO 自动生成的方法存根
		FinalAnimation.starts();
		
		ScoreDisplay.show();
	}

	//create inner class to listen the click of the button
	//when the player request for start the game, goto class GameMainBody
}
