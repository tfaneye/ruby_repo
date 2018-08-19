package dataTypeDemo;

public class Beverages {
	
	private byte brandCode = 123;
	public short areaCode = 34;
	public int qty = 4;
	public double price = 50;
	private char id = 'A';
	public String brandName = "Milo";
	public long barCode = 12853125543L;
	public float batchNumber = 3.1478F;
	public boolean dissolveInWater;
	
	public void buyBeverages() {
		
		if(dissolveInWater) {
			System.out.println("I will like to have "+ brandName + " please");
		}
		else {
			System.out.println("I don't want "+ brandName + " please");
		}		
		
	}

}
