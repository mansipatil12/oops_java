package arrays_and_string;
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize the array with 15 integers
        int[] array = new int[15];
        // Input values for the array
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // Menu for operations
        int choice;
        do {
            System.out.println("\nOperations Menu:");
            System.out.println("1. Sum and Average");
            System.out.println("2. Maximum and Minimum Values");
            System.out.println("3. Search for a Value");
            System.out.println("4. Reverse the Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    calculateSumAndAverage(array);
                    break;
                case 2:
                    findMaxAndMin(array);
                    break;
                case 3:
                    searchValue(array, scanner);
                    break;
                case 4:
                    reverseArray(array);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }
    // Method to calculate sum and average
    public static void calculateSumAndAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // Method to find maximum and minimum values
    public static void findMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    // Method to search for a specific value
    public static void searchValue(int[] array, Scanner scanner) {
        System.out.print("Enter the value to search for: ");
        int value = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("First occurrence of " + value + " found at index: " + index);
        } else {
            System.out.println(value + " not found in the array.");
        }
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        System.out.println("Reversed Array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
