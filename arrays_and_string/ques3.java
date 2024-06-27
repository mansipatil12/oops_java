package arrays_and_string;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string from the user
        boolean canFormPalindrome = canPermutePalindrome(input); // Check if a palindrome permutation is possible
        if (canFormPalindrome) {
            System.out.println("palindrome can be formed");
        } else {
            System.out.println("palindrome cannot be formed");
        }
        scanner.close(); // Close the scanner
    }
    public static boolean canPermutePalindrome(String s) {
        int[] charCounts = new int[128]; // Create an array to count character frequencies (assuming ASCII)
        for (char c : s.toCharArray()) { // Count the frequency of each character in the string
            charCounts[c]++;
        }
        int oddCount = 0; // Variable to keep track of characters with odd frequencies
        for (int count : charCounts) { // Check the frequency of each character
            if (count % 2 == 1) {
                oddCount++; // Increment the odd count if the character frequency is odd
            }
            if (oddCount > 1) { // If more than one character has an odd frequency, a palindrome cannot be formed
                return false;
            }
        }
        return true; // If zero or one character has an odd frequency, a palindrome can be formed
    }
}

