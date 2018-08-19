package modifiersDemo;

public class Animals {
	
	/**
	 * JAVA MODIFIERS
	 * TWO TYPES:
	 * 1) Access Modifiers
	 * 2) Non-Access Modifiers
	 * 
	 * {access modifiers} {non-access modifiers} class ClassName{}
	 * {access modifiers} {non-access modifiers} {data type} variableName;
	 * {access modifiers} {non-access modifiers} {data type} methodName(){}
	 * 
	 * ACCESS MODIFIERS
	 * FOUR TYPES OF ACCESS MODIFIERS
	 * 1) Default
	 * 2) public
	 * 3) private
	 * 4) protected
	 */
	
	public int legNumber = 2;  // Variables are reserved memory locations to store a particular value
	private String colourOfHair = "Black";
	public boolean hasVoice = true;
	String chasisNumber = "AACAV1234BJKJN";
	
	public void describeMyAnimal() {
		Animals animal = new Animals();
		String myAnimalHair = animal.colourOfHair;
		
	}
	
	

}

class Alien{
	private int numOfHead = 2;
	int numOfLegs = 4;
}
