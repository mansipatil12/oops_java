package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ques3 {
    public static int findKthSmallest(int[] arr, int k) { // Method to find the Kth smallest element in the array
        Arrays.sort(arr); // Sort the array
        return arr[k - 1]; // Return the Kth smallest element
    }
    public static int findKthLargest(int[] arr, int k) { // Method to find the Kth largest element in the array
        Arrays.sort(arr); // Sort the array
        return arr[arr.length - k]; // Return the Kth largest element
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
        System.out.print("Enter the value of K: "); // Take the value of K as input
        int k = scanner.nextInt();
        if (k <= 0 || k > n) { // Check if K is within the valid range
            System.out.println("K is out of range.");
            return;
        }
        int kthSmallest = findKthSmallest(arr, k); // Find the Kth smallest element
        int kthLargest = findKthLargest(arr, k); // Find the Kth largest element
        
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);// Print the Kth smallest element
        System.out.println("The " + k + "th largest element is: " + kthLargest);// Print the Kth largest elements
    }
}


