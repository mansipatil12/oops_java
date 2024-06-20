
// Import the Scanner class from java.util package to read input from the user
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        // Create a new Scanner object named scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        // user will enter an integer
        System.out.println("Enter an integer: ");
        // Read the integer entered by the user and store it in the variable 'number'
        int number = scanner.nextInt();
        // Check if the entered number is even or odd using the modulo (%) operator
        if (number % 2 == 0) { // If the remainder when dividing 'number' by 2 is 0, it's even
            // If the condition is true, print that the number is even
            System.out.println(number + " is Even");
        } else {
            // If the condition is false, print that the number is odd
            System.out.println(number + " is Odd");
        }
    }
}





