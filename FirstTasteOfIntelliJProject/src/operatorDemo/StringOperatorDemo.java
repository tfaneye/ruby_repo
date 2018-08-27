package operatorDemo;

public class StringOperatorDemo {

    public static void main(String[] args){
        String firstGreeting = "Hello".toLowerCase();
        String secondGreeting = "World";
        String fullGreetings = firstGreeting + secondGreeting;
        System.out.println(fullGreetings);

        String completeGreetings = firstGreeting.concat(" Are you there?");
        System.out.println(completeGreetings);


        int numOfCharacter = firstGreeting.length();
        System.out.println(numOfCharacter);

        String lowerFirstGreeting = firstGreeting.toLowerCase();
        System.out.println(lowerFirstGreeting);

        String upperFirstGreeting = firstGreeting.toUpperCase();
        System.out.println(upperFirstGreeting);

        String money = "£40";
        String newMoney = money.replaceFirst("£", "N");
        System.out.println(newMoney);




    }
}
