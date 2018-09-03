package constructorDemo;

public class Dog {

    private int dogLeg;
    private String dogBreed = "BullDog";
    private int dogAge = 6;

    /*public Dog(){

    }*/

    public Dog(int dogLeg, String dogBreed){
        this.dogLeg = dogLeg;
        this.dogBreed = dogBreed;
    }

    public int getDogAge(){
        return dogAge;
    }

    public int runDog(){
        if(dogLeg == 4){
            System.out.println("I have a dog called " + dogBreed + " and my dog can run");
        }
        return dogLeg;
    }
}
