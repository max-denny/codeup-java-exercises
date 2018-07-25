import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

       //int userInput;
        String userInput1;
        String userInput2;
        String userInput3;

        Scanner sc = new Scanner(System.in);

       System.out.print("Enter three words: ");
       userInput1 = sc.next();
       //userInput2 = sc.next();
       //userInput3 = sc.next();


       System.out.println("Your first word is: --> \"" + userInput1 + "\" <-- " +
               "\nYour second word is: --> \"" + userInput2 + "\" <--" +
               "\nYour third word is: --> \"" + userInput3 + "\" <--");
    }
}
