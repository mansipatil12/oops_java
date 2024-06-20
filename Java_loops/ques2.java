//package Java_loops;

// Import the Scanner class from java.util package to read input from the user
import java.util.Scanner;
// Declare a class named ques2
public class ques2 {
    // Declare the main method
    public static void main(String[] args) {
        // Create a new Scanner object named scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive integer: ");      
        // Read the integer entered by the user and store it in the variable 'n'
        int n = scanner.nextInt();      
        // Initialize the sum variable to store the sum of numbers from 1 to 'n'
        int sum = 0;       
        // Initialize the counter variable to 1, which will be used to iterate from 1 to 'n'
        int counter = 1;       
        // While loop to iterate from 1 to 'n'
        while (counter <= n) {
            // Add the value of 'counter' to 'sum'
            sum += counter;
            
            // Increment the value of 'counter' by 1 for the next iteration
            counter++;
        }
        // Display the sum of numbers from 1 to 'n'
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}




