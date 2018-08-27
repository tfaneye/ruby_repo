package operatorDemo;

public class ArithmeticDemo {
    /**
     *
     */

    private int a = 3;
    public int b = 30;
    private int m = 7;

    public void performAddition(){
        double c = a + b;
        System.out.println(c);
    }

    public void performSubtraction(){
        float ft = 3.142F;
        a = b;
        b = a;
        System.out.println(a - ft);
    }

    public void performMultiDivision(){
        long lg = 3245454L;
        System.out.println(a * lg);
        System.out.println(lg/2);
        System.out.println(m%2);

        m++;
        System.out.println(m%2);

        m--;
        System.out.println(m%2);


    }
}
