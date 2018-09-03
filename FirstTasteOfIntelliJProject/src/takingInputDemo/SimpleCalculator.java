package takingInputDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleCalculator {

    public SimpleCalculator() {
    }

    public void takeInput(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("Please enter your first number");
            String strNumber1 = br.readLine();
            int num1 = Integer.parseInt(strNumber1);
            //int num1 = br.read();
            System.out.println("Please enter your second number");
            String strNumber2 = br.readLine();
            int num2 = Integer.parseInt(strNumber2);
            //int num2 = br.read();
            System.out.println(num1 + num2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void performAddition(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int num1 = scanner.nextInt();
        if(num1 < 10){
            System.err.println("Please choose different number greater than 10!!");
            int num = scanner.nextInt();
            num1 = num;
            System.out.println("Please enter your second number");
            int num2 = scanner.nextInt();
            System.out.println(num1 + num2);
        }
        else {
            System.out.println("Please enter your second number");
            int num2 = scanner.nextInt();
            System.out.println(num1 + num2);
        }
    }
}
