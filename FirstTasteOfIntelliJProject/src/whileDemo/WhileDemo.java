package whileDemo;

public class WhileDemo {

    public static void main(String[] args) {
     //   int count = 10;
     //   while(count <= 20){
      //      System.out.println("Count is " + count);
     //       count++;
     //   }

        /*int num = 1;
        do{
            System.out.println("number " + num);
            num++;
        }while(num < 11);*/

        //Example of for loop
        /*for(int i = 1; i < 11; i++){
            System.out.println("i = " + i);
        }*/

        //Example of Enhanced Loop
        /*int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int item : numbers){
            System.out.println("item number "  + item);
        }

        String[] fruitNames = {"Orages", "Mangos", "Apples", "Banana"};
            for(String fruit : fruitNames){
                System.out.println("FruitType = " + fruit);
        }*/

        String[] names = {"John", "Ben", "James", "Andy", "Victoria"};
            for(String name : names){
                if(name.equals("Andy")){
                    System.out.println(name);
                    break;

                }
            }
    }
}
