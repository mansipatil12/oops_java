package arrays_and_string;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter the first string (inp1): ");
        String inp1 = scanner.nextLine(); // Read the first input string from the user

        System.out.print("Enter the second string (inp2): ");
        String inp2 = scanner.nextLine(); // Read the second input string from the user

        String result = getCharsAroundSubstring(inp1, inp2); // Get the resulting string
        System.out.println("The resulting string is: " + result); // Print the result

        scanner.close(); // Close the scanner
    }

    public static String getCharsAroundSubstring(String inp1, String inp2) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string manipulation

        int index = 0; // Initialize index to start searching from the beginning of inp1
        int len = inp2.length(); // Get the length of inp2 for future use

        while ((index = inp1.indexOf(inp2, index)) != -1) { // Find the next occurrence of inp2 in inp1
            // Check if there is a character before the found substring
            if (index > 0) {
                result.append(inp1.charAt(index - 1)); // Append the character before the found substring
            }
            // Check if there is a character after the found substring
            if (index + len < inp1.length()) {
                result.append(inp1.charAt(index + len)); // Append the character after the found substring
            }
            index += len; // Move the index past the current found substring
        }

        return result.toString(); // Convert StringBuilder to String and return the result
    }
}
