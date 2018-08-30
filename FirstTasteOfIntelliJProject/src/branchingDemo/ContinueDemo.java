package branchingDemo;

public class ContinueDemo {

    //lets consider the word "mississipi

    public static void main(String[] args) {
        String word = "mississipi";
        int len = word.length();
        int numOfS = 0;
        for(int i = 0; i < len; i++){
            if(word.charAt(i) != 's')
                continue;
            numOfS++;
        }
        System.out.println("There are " + numOfS + " S's in " + word);
    }
}
