// Importing the Scanner class from java.util package to read input from the user
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         // Create a new Scanner object named scanner to read input from the user     
        System.out.println("Enter three integers: ");    // Prompt the user to enter three integers 
        // Read the three integers entered by the user and store them in variables num1, num2, and num3
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();      
        int largest; // Declare a variable named largest to store the largest number among the three
        // Nested if-else statements to find the largest number among the three
        if (num1 >= num2) {
            largest = num1; // Assign num1 to largest if num1 is greater than or equal to num2
            if (num1 > num3) {
                largest = num1;  // If num1 is also greater than num3, assign num1 to largest
            } else {
                largest = num3; // If num1 is not greater than num3, assign num3 to largest
            }
        } else {
            largest = num2; // Assign num2 to largest if num1 is not greater than num2
            if (num2 > num3) {
                largest = num2; // If num2 is also greater than num3, assign num2 to largest
            } else {
                largest = num3; // If num2 is not greater than num3, assign num3 to largest
            }
        }
        System.out.println("The largest number is: " + largest); // Print the largest number among the three$
    }
}
