package crisis;

public class Option {

	int identifier;
	
	String description;
	
	int sfChange;
	int lszzChange;
	int lsxxChange;
	int jkChange;
	int slChange;
	int myChange;
	
	Crisis nextCrisis;
	
	Option(){
		nextCrisis = null;
	}
}
