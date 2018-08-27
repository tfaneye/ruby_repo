package operatorDemo;

public class RelationDemo {
    private int value1 = 12;
    private int value2 = 10;
    private boolean genius = true;

    public void performRelationalOperation(){
         if (value1 == value2){
             System.out.println(value1 + " = " + value2);
         }
         if(value1 != value2){
             System.out.println(value1 + " != " + value2);
         }
         if(value1 > value2){
             System.out.println("value1 > value2");
         }
        if(value1 < value2){
            System.out.println("value1 < value2");
        }
    }

    public void performLogicalOperations(){
        if(value1 == 12 && value2 == 10){
            System.out.println("value1 = " + value1 + " AND value2 = " + value2);
        }
        else{
            System.out.println("One of the conditions is not fulfilled");
        }
        if(value1 == 12 || value2 == 10){
            System.out.println("value1 = " + value1 + " AND value2 = " + value2);
        }
        else{
            System.out.println("None of the conditions is fulfilled");
        }
        if(!genius){
            int result = value1 * value2;
            System.out.println(result);
        }
        else {
            System.out.println("I'm not a genius");
        }
    }

    public void performMoreOperations(){

        int res = value1 + value2;
        System.out.println(res);

        value1 += 2;
        int newRes = value1 + value2;
        System.out.println(newRes);

        value2 -= 2;
        int newValue = value1 + value2;
        System.out.println(newValue);

        value1 += value2;
        int moreResult = value1 + value2;
        System.out.println(moreResult);
    }

    public static void main(String[] args) {
        RelationDemo relationDemo = new RelationDemo();
        //relationDemo.performRelationalOperation();

        //relationDemo.performLogicalOperations();

        relationDemo.performMoreOperations();
    }
}
