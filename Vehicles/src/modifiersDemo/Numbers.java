package modifiersDemo;

public class Numbers {

	public static void main(String[] args) {
		int workingHour = 8;
		double rate = 10.0;
		
		double salary = workingHour * rate;
		
		System.out.println("My salary for a day is = £" + salary);
		
		if(rate == 10.0) {
			rate = 30;
			double newSalary = workingHour * rate;
			System.out.println("My new salary for a day is = £" + newSalary);
		}

	}

}
