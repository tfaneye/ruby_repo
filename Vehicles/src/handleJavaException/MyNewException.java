package handleJavaException;

import arrayDemo.ExampleArray;
import handlingExceptions.MathsException;

public class MyNewException {

	public static void main(String[] args) {
		
		MathsException excep = new MathsException();
		//excep.playWithNumbers();
		
		ExampleArray ea = new ExampleArray();
		ea.getDirection();

	}

}
