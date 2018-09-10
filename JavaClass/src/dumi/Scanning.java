package dumi;
import java.util.Scanner;
public class Scanning

{



    public static void main(String[]args){



        Scanner scan = new Scanner(System.in);



        boolean correctLoggin = false;

        String username;

        String password;

        String enteredUsername;

        String enteredPassword;





        System.out.println("Please enter a username");

        username = scan.nextLine();





        System.out.println("Please enter a password");

        password = scan.nextLine();



        while(correctLoggin != true){

            System.out.println("Please login below");

            System.out.println("Please enter your username");

            enteredUsername = scan.nextLine();



            System.out.println("Next, enter your password");

            enteredPassword =scan.nextLine();



            if(enteredUsername.equals(username) && enteredPassword.equals(password)){

                System.out.println("You have entered the correct login info");

                correctLoggin = true;

                break;





            } else {



                System.out.println("Your login info was incorrect, please try again later");



                System.out.println("You have successiful logged in, congradulations");

            }



        }









    }

}



