import javax.swing.*;
import java.util.InputMismatchException;


public class Calculator {

    // main function
    public static void main(String[] args){


        // initialized values
        int number1 = 0;
        int number2 = 0;
        int option = 0;

        // message to print with calculator options
        String message = "Please select a option\n1. Add \n2. rest\n3. Multiplication \n4. Division";



        try {
            option = Integer.parseInt(JOptionPane.showInputDialog(message));

            // exception logical
            if (option > 4 || option < 1 ){
                JOptionPane.showMessageDialog(null,"Error, please enter a value in range");
                main(args);
                System.exit(0);
            }
            number1 = Integer.parseInt(JOptionPane.showInputDialog("Please Enter first number"));
            number2 = Integer.parseInt(JOptionPane.showInputDialog("Now, enter second one"));
        } catch (NumberFormatException e){ // Capture the NumberFormatException error
            JOptionPane.showMessageDialog(null,"Error :"+ e +", please enter a right value");
            main(args);
            System.exit(0);
        } catch (InputMismatchException e) { // Capture the InputMismatchException error
            JOptionPane.showMessageDialog(null,"Error :  "+ e +", please enter a right value");
            main(args);
            System.exit(0);
        }

        // Logic of calculator and print result
        if (option == 1) {
            JOptionPane.showMessageDialog(null, "Result: " + number1 + " + " + number2 + " = "+  (number1 + number2));
        } else if (option == 2) {
            JOptionPane.showMessageDialog(null, "Result: " + number1 + " - " + number2 + " = "+  (number1 - number2));
        } else if (option == 3) {
            JOptionPane.showMessageDialog(null, "Result: " + number1 + " * " + number2 + " = "+  (number1 * number2));
        } else if (option == 4) {
            JOptionPane.showMessageDialog(null, "Result: " + number1 + " / " + number2 + " = "+  (number1 / number2));
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, undefined selection ");
        }
    }

}