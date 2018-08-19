package newVehicles;

public class Jaquar {
	
	/**
	 * Class as blueprint to which objects are derived from. or A template or blue print that
	 * describes the Behaviours or States of an object
	 * 
	 * States is referred to as Variables
	 * Behaviour is referred to as Methods
	 * 
	 * VARIABLES
	 * 3 TYPES
	 * 1) Instance or Field variables
	 * 2) Local Variables
	 * 3) Class Variables
	 * 
	 * Definition: Variables are reserved memory locations to store a particular value
	 * 
	 */
	
	public Integer age;  //variable declaration
	
	public int age2 = 40;
	
	public int maxSpeed = 280;
	public String registrationNumber = "AB12CDE";
	public static final int numOfTyres = 4;  //Class variable
	public String jaquarColour = "Black";
	
	public void describeMyJaquar() {
		int numOfCDPlayers = 6;  //Local variables
		
		System.out.println("My Jaquar has maximum Speed of " + maxSpeed);
		System.out.println("My Jaquar registration number is " + registrationNumber);
		System.out.println("My Jaquar colour is " + jaquarColour);
		System.out.println("My Jaquar sterio has Cd Player of " + numOfCDPlayers);
	}
	
	public void talkingJaquar() {
		System.out.println("My Jaquar has maximum Speed of " + maxSpeed);
		System.out.println("My Jaquar registration number is " + registrationNumber);
		System.out.println("My Jaquar colour is " + jaquarColour);
	}
	
	public static void main(String args[]) {
		Jaquar myJaquar = new Jaquar();   //the process of creating an object is called Instantiation
		myJaquar.describeMyJaquar();
		
		
		Jaquar myNewJaquar = new Jaquar();
		myNewJaquar.talkingJaquar();
		
		int jaquarTyres = Jaquar.numOfTyres;
		System.out.println(jaquarTyres);
	}

}
