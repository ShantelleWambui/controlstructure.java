public class ControlStructure {



    public static void main(String[] args) {

        // If-else statement

        int x = 10;

        if (x > 5) {

            System.out.println("x is greater than 5");

        } else {

            System.out.println("x is not greater than 5");

        }



        // For loop

        System.out.println("Printing numbers from 1 to 5 using a for loop:");

        for (int i = 1; i <= 5; i++) {

            System.out.print(i + " ");

        }

        System.out.println(); // For a new line



        // While loop

        int countdown = 5;

        System.out.println("Countdown from 5 using a while loop:");

        while (countdown > 0) {

            System.out.print(countdown + " ");

            countdown--;

        }

        System.out.println(); // For a new line

    }

}
