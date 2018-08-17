package lessons;

import java.util.Arrays;

public class ArraysLesson {

    String[] simpsons = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};

    public static void main(String[] args) {

        // Create an array for numbers 1-5 and print it out//
        //declare data type//tell it you're making an array//name the array//
        String[] parksDepartment = {"Leslie", "Ron", "Jerry", "Tom", "April", "Andy"};
        for(String p : parksDepartment){
            System.out.println(p);
        }

        String[] simpsons = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};

        for(String simp : simpsons){
            System.out.println(simp);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.println("| ");

            for (int n : row) {
                System.out.println(n + " | ");
            }
            System.out.println();
        }

        System.out.println("+---+---+---+");







        /*int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers[0]);

        System.out.println(numbers[1]);

        System.out.println(numbers[2]);
    }*/

       //double[] prices = new double[4];

        String[] beatles = {"John", "Paul", "Ringo"};

        System.out.println(beatles[0]);


        String[] languages = {"html", "css", "javascript", "java"};

        for (int i = 0; i < languages.length; i ++) {
            System.out.println(languages[i] + "\n");
        }

        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println(languages[0]);
    }
}