import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    // main function
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // initialized values
        int number1 = 0;
        int number2 = 0;
        int option = 0;

        // message to print with calculator options
        String message = "Please select a option\n1. Add \n2. rest\n3. Multiplication \n4. Division";

        System.out.println(message);

        try {
            option = scanner.nextInt();
            System.out.println("Please Enter first number");
            number1 = scanner.nextInt();
            System.out.println("Now, enter second one");
            number2 = scanner.nextInt();
        } catch (NumberFormatException e){ // Capture the NumberFormatException error
            System.out.println("Error, please enter a right value" );
            main(args);
            System.exit(0);
        } catch (InputMismatchException e) { // Capture the InputMismatchException error
            System.out.println("Error, please enter a right value" );
            main(args);
            System.exit(0);
        }

        // Logic of calculator and print result
        if (option == 1) {
            System.out.println("Result: " + number1 + " + " + number2 + " = "+  (number1 + number2));
        } else if (option == 2) {
            System.out.println("Result: " + number1 + " - " + number2 + " = "+  (number1 - number2));
        } else if (option == 3) {
            System.out.println("Result: " + number1 + " * " + number2 + " = "+  (number1 * number2));
        } else if (option == 4) {
            System.out.println("Result: " + number1 + " / " + number2 + " = "+  (number1 / number2));
        } else {
            System.out.println("Sorry, undefined selection ");
        }
    }
}