package dataTypeConversionDemo;

public class ConversionDemo {

    public static void main(String[] args){

        String age = "30";
        //System.out.println(age - 5);

        int newAge = Integer.parseInt(age); //String to Integer
        int johnAge = newAge - 5;
        System.out.println(johnAge);

        double dbAge = Double.parseDouble(age);
        System.out.println(dbAge);

        long lgAge = Long.parseLong(age);
        System.out.println(lgAge);

        float ftAge = Float.parseFloat(age);
        System.out.println(ftAge);

        boolean blAge = Boolean.parseBoolean(age);
        System.out.println(blAge);

        System.out.println("\n=====================================================");

        //to convert Integer to String

        int amount = 40;
        System.out.println(amount - 30);

        String strAmount = Integer.toString(amount);
        //System.out.println(strAmount - 30);

        double num = 42.20;

        String dbNum = Double.toString(num);
        System.out.println(dbNum);
    }
}
