package controlFlowSatatements;

import java.util.Scanner;

public class IfElseDemo {

    private int numOfwheels = 2;
    private boolean isMoving = false;
    private String bikeType = "Mountain Bike";
    private int speed = 20;

    public void rideBicycles(int currentSpeed){
        currentSpeed = speed;
        if(isMoving){
            currentSpeed--;
            System.out.println(currentSpeed);
        }
        else{
            currentSpeed += speed;
            System.out.println(currentSpeed);
        }
    }

    public void selectExamGrade(){
        System.out.println("What is you exam score?");
        Scanner scanner = new Scanner(System.in);
        int examScore = scanner.nextInt();
        //int examScore = 50;
        char grade;
        if(examScore >= 90){
            grade = 'A';
            System.out.println("Grade = " + grade);
        }
        else if(examScore >= 75 && examScore < 90){
            grade = 'B';
            System.out.println("Grade = " + grade);
        }
        else if(examScore >= 60 && examScore < 75){
            grade = 'C';
            System.out.println("Grade = " + grade);
        }
        else if(examScore >= 45 && examScore < 60){
            grade = 'D';
            System.out.println("Grade = " + grade);
        }
        else if(examScore >= 40 && examScore < 45){
            grade = 'E';
            System.out.println("Grade = " + grade);
        }
        else if(examScore < 40){
            grade = 'F';
            System.out.println("Grade = " + grade);
        }
        else {
            System.out.println("No such grade exists");
        }
    }

    public static void main(String[] args) {
        IfElseDemo ifElseDemo = new IfElseDemo();
        //ifElseDemo.rideBicycles(30);
        //ifElseDemo.selectExamGrade();

        SwitchDemo switchDemo = new SwitchDemo();
        //switchDemo.selectExamGrade();
        switchDemo.getMonthOfTheYear();
    }
}
