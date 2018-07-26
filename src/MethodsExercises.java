import java.util.Scanner;

public class MethodsExercises {

    static Scanner scanner = new Scanner(System.in);

    static int userInput;

    public static int addition(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static float division(float n1, float n2) {
        return n1 / n2;
    }

    public static int modulUs(int n1, int n2) {
        return n1 % n2;
    }

    public static int getInRange(int min, int max) {
        System.out.println("Enter a number between 1 and 10");
        userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Hey, you're out of range");
            return getInRange(min, max);
        } else {
            return userInput;
        }

    }


    public static void main(String[] args) {

        System.out.println(addition(6, 4));
        System.out.println(subtraction(6, 4));
        System.out.println(multiplication(6, 4));
        System.out.println(division(6, 0));
        System.out.println(modulUs(6, 4));

       // System.out.print("Enter a number between 1 and 10: ");
        //int userInput = getInteger(1,10);
        System.out.println(getInRange(1, 10));

    }
}


