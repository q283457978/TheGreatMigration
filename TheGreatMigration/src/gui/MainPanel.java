package gui;


import finalAnimation.FinalAnimation;

public class MainPanel {

	public static void setUp() {
		// TODO �Զ����ɵķ������
		//set up the main panel,and register some button
		//to listen the request to view 'about us','gameIntroduction'
		//,'achievement','start'etc.
	}

	public static void TimeOver() {
		// TODO �Զ����ɵķ������
		FinalAnimation.starts();
		
		ScoreDisplay.show();
	}

	//create inner class to listen the click of the button
	//when the player request for start the game, goto class GameMainBody
}
