package controlFlowSatatements;

import java.util.Scanner;

public class SwitchDemo {

    public void selectExamGrade(){
        int examScore = 50;
        char grade;
        switch (examScore){
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'B';
                break;
            case 60:
                grade = 'B';
                break;
            case 50:
                grade = 'C';
                break;
            case 40:
                grade = 'D';
                break;
            case 30:
                grade = 'E';
                break;
                default:
                    grade = 'F';
                    break;
        }
        System.out.println(grade);
    }

    public void getMonthOfTheYear(){
        System.out.println("Enter the number of the month");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String monthOfTheYear;

        switch (month){
            case 1:
                monthOfTheYear = "January";
                break;
            case 2:
                monthOfTheYear = "February";
                break;
            case 3:
                monthOfTheYear = "March";
                break;
            case 4:
                monthOfTheYear = "April";
                break;
            case 5:
                monthOfTheYear = "May";
                break;
            case 6:
                monthOfTheYear = "June";
                break;
            case 7:
                monthOfTheYear = "July";
                break;
            case 8:
                monthOfTheYear = "August";
                break;
            case 9:
                monthOfTheYear = "September";
                break;
            case 10:
                monthOfTheYear = "October";
                break;
            case 11:
                monthOfTheYear = "November";
                break;
            case 12:
                monthOfTheYear = "December";
                break;
            default:
                monthOfTheYear = "No such Month";
                break;
        }

        System.out.println(monthOfTheYear);
    }

}
