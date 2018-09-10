package assignmentTwo;

import java.util.Scanner;

public class VendingMachine {

    public static void drinkDispenser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What drink would you like please?");
        String myDrinkChoice = scanner.nextLine();

        if(myDrinkChoice.equalsIgnoreCase("Coffee")){
            System.out.println("White or Black?");
            String myCoffeeChoice = scanner.nextLine();

            if(myCoffeeChoice.equalsIgnoreCase("White")){
                System.out.println("How many sugar please?");
                int mySugarChoice = scanner.nextInt();
                if(mySugarChoice > 3){
                    System.out.println("Sorry, you cannot add more than 3 sugars");
                }else {
                    System.out.println("Kindly wait while we prepare your Coffee please...");
                    scanner.nextLine();
                    System.out.println("Here is your White Coffee with " + mySugarChoice + " sugars please");
                    scanner.nextLine();
                }

            }
            else if(myCoffeeChoice.equalsIgnoreCase("Black")){
                System.out.println("How many sugar please?");
                int mySugarChoice = scanner.nextInt();
                if(mySugarChoice > 3){
                    System.out.println("Sorry, you cannot add more than 3 sugars");
                }
                else {
                    System.out.println("Kindly wait while we prepare your Coffee please...");
                    scanner.nextLine();
                    System.out.println("Here is your Black Coffee with " + mySugarChoice + " sugars please");
                    scanner.nextLine();
                }

            }
            else {
                System.out.println("Sorry we only either white or black coffee");
            }
        }
        else if(myDrinkChoice.equalsIgnoreCase("Tea")){
            System.out.println("Herbal or Normal please");
            String myTeaChoice = scanner.nextLine();

            if(myTeaChoice.equalsIgnoreCase("Herbal")){
                System.out.println("How many sugar please");
                int mySugarChoice = scanner.nextInt();
                if(mySugarChoice > 3){
                    System.out.println("Sorry you cannot add more than 3 sugars");
                }
                else {
                    System.out.println("Kindly wait while we prepare your Tea please...");
                    scanner.nextLine();   //press enter
                    System.out.println("Here is your Herbal Tea with " + mySugarChoice + " sugars please");
                    scanner.nextLine();  //press enter
                }

            }
            else if(myTeaChoice.equalsIgnoreCase("Normal")){
                System.out.println("Do you want milk, type Yes or No");
                String myMilkChoice = scanner.nextLine();
                if(myMilkChoice.equalsIgnoreCase("Yes")){
                    System.out.println("How many sugar please");
                    int mySugarChoice = scanner.nextInt();
                    if(mySugarChoice > 3){
                        System.out.println("Sorry you cannot add more than 3 sugars");
                    }
                    else {
                        System.out.println("Kindly wait while we prepare your Tea please...");
                        scanner.nextLine();   //press enter
                        System.out.println("Here is your Normal Tea with milk and " + mySugarChoice + " sugars please");
                        scanner.nextLine();  //press enter
                    }

                }
                else if(myMilkChoice.equalsIgnoreCase("No")){
                    System.out.println("How many sugar please");
                    int mySugarChoice = scanner.nextInt();
                    if(mySugarChoice > 3){
                        System.out.println("Sorry you cannot add more than 3 sugars");
                    }
                    else {
                        System.out.println("Kindly wait while we prepare your Tea please...");
                        scanner.nextLine();   //press enter
                        System.out.println("Here is your Normal Tea without milk and " + mySugarChoice + " sugars please");
                        scanner.nextLine();  //press enter
                    }

                }
                else {
                    System.out.println("Sorry you can only type Yes or No");
                }
            }
            else {
                System.out.println("We only have options for Normal or Herbal tea please!");
            }
        }
        else if(myDrinkChoice.equalsIgnoreCase("Hot Chocolate")){
            System.out.println("Kindly wait while we prepare your Hot Chocolate please...");
            scanner.nextLine();   //press enter
            System.out.println("Please take you Hot Chocolate");
        }
        else if(myDrinkChoice.equalsIgnoreCase("Vegetable Soup")) {
            System.out.println("Kindly wait while we prepare your vegetable soup please...");
            scanner.nextLine();   //press enter
            System.out.println("Please take you vegetable soup");
        }
        else if(myDrinkChoice.equalsIgnoreCase("OrangeJuice")){
            System.out.println("Kindly wait while we prepare your orange juice please...");
            scanner.nextLine();
            System.out.println("Please take you Orange Juice");
        }
        else {
            System.out.println("\nWe do not serve such drink here!\nThank you bye bye");
        }
    }

    public static void main(String[] args) {
        drinkDispenser();
    }

}
