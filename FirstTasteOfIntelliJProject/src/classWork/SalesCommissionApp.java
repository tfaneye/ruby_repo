package classWork;

import java.util.Scanner;

public class SalesCommissionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your sales amount");
        double sales = scanner.nextDouble();
        if(sales < 100){
            double salesComm = 0.025 * sales;
            System.out.println("Thank you for your contribution, £" + salesComm + " has been paid into your account as commission for your sales of £" + sales);
            double netSales = sales - salesComm;
            System.out.println("Your net sales now is £" + netSales);
        }
        else if (sales >= 100 && sales <= 500){
            double salesComm = 0.08 * sales;
            System.out.println("Thank you for your contribution, £" + salesComm + " has been paid into your account as commission for your sales of £" + sales);
            double netSales = sales - salesComm;
            System.out.println("Your net sales now is £" + netSales);
        }
        else if (sales >= 5001 && sales <= 1000){
            double salesComm = 0.125 * sales;
            System.out.println("Thank you for your contribution, £" + salesComm + " has been paid into your account as commission for your sales of £" + sales);
            double netSales = sales - salesComm;
            System.out.println("Your net sales now is £" + netSales);
        }
        else if (sales >= 1001 && sales <= 5000){
            double salesComm = 0.175 * sales;
            System.out.println("Thank you for your contribution, £" + salesComm + " has been paid into your account as commission for your sales of £" + sales);
            double netSales = sales - salesComm;
            System.out.println("Your net sales now is £" + netSales);
        }
        else if (sales >= 5001){
            double salesComm = 0.23 * sales;
            System.out.println("Thank you for your contribution, £" + salesComm + " has been paid into your account as commission for your sales of £" + sales);
            double netSales = sales - salesComm;
            System.out.println("Your net sales now is £" + netSales);
        }
    }


}
