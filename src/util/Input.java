
//THIS ENTIRE CLASS IS ABOUT RECEIVING INPUT FROM THE USER//

package util;

import java.util.Scanner;

public class Input {/*
    //This line creates new scanner(from Java class library) that we name 'scan'.
    private Scanner scan = new Scanner(System.in);


    //The first thing we want to do is get a string from the user.//


    //This line will initialize our method//
    public String getString(String prompt) {
        //This line will print out the prompt we provide in the parameter for the user//
        System.out.println(prompt);
        //This line returns what the string the user provided in lower case w/o outside white space//
        return this.scan.nextLine().toLowerCase().trim();
    }


    //RETURNS TRUE IF THE USER ENTERS YES OR EQUIVALENT//

    //This line defines a method we name 'yesNo'//
    public boolean yesNo() {
        //This line://
        // defines a property of the method we assign as 'result'//
        // assigns it to whatever the user inputs via 'getString' method//
        //With 'Type yes or no' prompt'//
        String result = this.getString("Type yes or no (y/n)");
        //This line returns a true value if the user enters 'yes' or 'y' equivalent//
        return (result.equals("y") || result.equals("yes"));
    }

    //---------------//


    //GET AN INTEGER VALUE WITHIN RANGE FROM USER//

    public int getInt(int min, int max) {

        int userInput = Integer.parseInt(this.getString(
                "Give me a number between " + min +
                        " and " + max));

        if (userInput < min || userInput > max) {
            System.err.println("Number out of range");
            getInt(min, max);
        }

        return userInput;
    }

    //------------------------------//


    // GET AN INTEGER VALUE FROM THE USER//
    public int getInt() {

        String input = getString() {
            return Integer.parseInt(this.getString("Give me a number"));

            try {
                Integer.valueOf(input);

            } catch (NumberFormatException e) {
                System.out.println("Must input an integer");
                return getInt();
            }

        }
        }


        // GET A DOUBLE VALUE FROM THE USER//

        public double getDouble ( double min, double max){
            double userInput = Double.parseDouble(this.getString("Give me a a decimal" +
                    "number between " + min + " and " + max));

            if (userInput < min || userInput > max) {
                System.err.println("Decimal number out of range");
                userInput = getDouble(min, max);
            }

            return userInput;
        }

        public double getDouble () {
            return Double.parseDouble(this.getString("Give me a decimal number"));
        }



        public double getDouble () {
            String input = getString();

            try {
                return Double.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Input must be number.");
                return getDouble();
            }
        }


        public static void main (String[]args){
            Input input1 = new Input();


            System.out.println(input1.getString("Type your name in any format: "));

            System.out.println(input1.yesNo());

            System.out.println(input1.getInt(5, 6));

            System.out.println(input1.getDouble(2, 20));

            System.out.println(input1.getDouble());

        }

    }
    */
}

//---------------------------------------------------------------------------------//