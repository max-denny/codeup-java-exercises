import java.util.Scanner;

public class JavaBonusMethods {

    static Scanner scanner = new Scanner(System.in);

    public static void countAs(String userWord) {
        // String userWord = scanner.next();
        for (int i = 0; i < userWord.length(); i++) {
            //System.out.println(userWord.charAt(i));
            if (userWord.charAt(i) == 'a') {
                System.out.println("Count A");
            }
        }
    }

    public static void countEs(String userWord) {
        for (int i = 0; i< userWord.length(); i++) {
            if(userWord.charAt(i) == 'e') {
                System.out.println("Count E");
            }
        }
    }

    public static void countIs(String userWord) {
        for (int i = 0; i < userWord.length(); i++) {
            if(userWord.charAt(i) == 'e') {
                System.out.println("Count I");
            }
        }
    }

    public static void countOs(String userWord) {
        for(int i = 0; i < userWord.length(); i++) {
            if(userWord.charAt(i) == 'o') {
                System.out.println("Count O");
            }
        }
    }

    public static void countUs(String userWord) {
        for(int i = 0; i < userWord.length(); i++) {
            if(userWord.charAt(i) == 'u') {
                System.out.println("Count U");
            }
        }
    }

    /*public static void countVowels(String userWord) {
        for (int i = 0; i < userWord.length(); i++) {
            //return countAs());
            System.out.println();
            System.out.println(countIs(userWord));
            System.out.println(countOs(userWord));
            System.out.println(countUs(userWord));
        }
    }*/

    public static void main(String[] args){
        System.out.println("This is the Java Bonus Method");

        countAs("alphabetical octuplets");
        countUs("alphabetical octuplets");
        countOs("alphabetical octuplets");
        countIs("alphabetical octuplets");
        countEs("alphabetical octuplets");
        //countVowels("alphabetical octuplets");
    }
}
