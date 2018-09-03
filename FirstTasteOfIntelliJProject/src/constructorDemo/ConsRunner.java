package constructorDemo;

public class ConsRunner {

    public static void main(String[] args) {
        Dog bullDog = new Dog(4, "Labrador");
        int myDogAge = bullDog.getDogAge();
        System.out.println(myDogAge);

        int myDogLeg = bullDog.runDog();
        System.out.println(myDogLeg);
    }
}
