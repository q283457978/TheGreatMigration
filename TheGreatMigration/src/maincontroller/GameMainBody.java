package maincontroller;

import crisis.CrisisLoader;
import gui.MainPanel;

public class GameMainBody {

	static final int SECOND_PER_DAY = 2;
	
	void gameMainThread(){
		
		CrisisLoader.loadCrisis();
		askForInitialPolicy();//such as migration speed
		
		//time begin to pass
		for(int i = 0;i<365;i++){//this should be replaced by a timer,every second will loop one time
		
		Parameter.inspection();
		
		//set a random choice to determine if there is a event.
		//also influenced by parameter inspection
		
		//show new time
//		MainPanel.updateTimeShown(time); 
		}
	
	MainPanel.TimeOver();
	}

	private void askForInitialPolicy() {
		// TODO 自动生成的方法存根
		
	}
}
