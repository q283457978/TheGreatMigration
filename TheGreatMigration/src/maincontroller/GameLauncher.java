package maincontroller;

import initialAnimation.InitialAnimation;
import crisis.CrisisLoader;
import gui.Frame;
import gui.MainPanel;
public class GameLauncher {

	public static void main(String args[]){
		
		Frame.setUp();
		InitialAnimation.starts();

		CrisisLoader.loadCrisis();
		
		MainPanel.setUp();
	}
}
