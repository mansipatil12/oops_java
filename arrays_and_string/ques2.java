package arrays_and_string;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input       
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine(); // Read the first word from the user
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine(); // Read the second word from the user
        String combinedWord = combineWords(word1, word2); // Combine the two words
        System.out.println("The combined word is: " + combinedWord); // Print the combined word
        scanner.close(); // Close the scanner
    }
    public static String combineWords(String word1, String word2) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string manipulation
        int length1 = word1.length(); // Length of the first word
        int length2 = word2.length(); // Length of the second word
        int minLength = Math.min(length1, length2); // Find the minimum length of the two words
        // Interleave characters from both words
        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i)); // Append character from word1
            result.append(word2.charAt(i)); // Append character from word2
        }
        // Append remaining characters from the longer word
        if (length1 > length2) {
            result.append(word1.substring(minLength)); // Append remaining characters from word1
        } else if (length2 > length1) {
            result.append(word2.substring(minLength)); // Append remaining characters from word2
        }
        return result.toString(); // Convert StringBuilder to String and return the result
    }
}

