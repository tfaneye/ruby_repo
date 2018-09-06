package myVehicles;

public class Rangerover {

/**
 *States is refereed to variables
 *Behaviour is refereed to methods
 *
 * 
 * They are 3 types of Variables
 * 
 * 1) Instance or Field
 * 2) Local
 * 3) Class
 * 
 */
	
	public int MaxSpeed = 320;
	public String regNumber = "LG18EZW";
	public static final int numOfTyres = 4;
	public String color = "Black";
	
	
	
	public void describeMyRangerover() {
		
		System.out.println("              Read the botton 5 lines about my brand new SUV car from (EBAY) :) :) !!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("                My Rangerover has a Speed of " + MaxSpeed); 
		System.out.println("                 My Rangerover regNumber is  " + regNumber);
		System.out.println("                   My Rangerover color is  " + color);
		System.out.println("                      I Love it");
		System.out.println("                        ThoughItsAdream");
		
	}




public void describeMyNewRangerover() {
	
	
}


public static void main(String args[]) {
	
	Rangerover MyRangerover = new Rangerover();
	MyRangerover.describeMyRangerover();
	

	
	
}
}



