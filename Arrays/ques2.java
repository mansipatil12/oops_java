package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ques2 {   
    public static boolean findTriplets(int[] arr, int x) { // Method to check if there exist any triplets with the given sum
        int n = arr.length;
        Arrays.sort(arr); // Sort the array to apply the two-pointer technique
        for (int i = 0; i < n - 2; i++) { // Traverse the array
            int left = i + 1; // Initialize the left pointer
            int right = n - 1; // Initialize the right pointer
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right]; // Calculate the sum of the triplet
                if (sum == x) { // If the sum is equal to x, triplet found
                    return true;
                } else if (sum < x) { // If the sum is less than x, move the left pointer to the right
                    left++;
                } else { // If the sum is greater than x, move the right pointer to the left
                    right--;
                }
            }
        }
        return false; // Return false if no triplet is found
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: "); // Take the size of the array as input
        int n = scanner.nextInt();
        int[] arr = new int[n]; // Initialize the array with the input size
        System.out.println("Enter the elements of the array: "); // Take the array elements as input
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of x: "); //take the value of x as input
        int x = scanner.nextInt();
        boolean result = findTriplets(arr, x); // Check if there exist any triplets with the given sum
        if (result) {
            System.out.println("Triplets with the given sum exist."); // Print the result
        } else {
            System.out.println("No triplets with the given sum exist.");
        }
    }
}



