package Arrays;
import java.util.Scanner;

public class ques4 {
    private static int findPeakUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2; // Find the middle element
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) { // Check if the middle element is the peak and its neighbors are smaller
            return mid;
        }
        if (mid > 0 && arr[mid - 1] > arr[mid]) { // If left neighbor is greater, peak lies on the left side
            return findPeakUtil(arr, low, mid - 1, n);
        }
        return findPeakUtil(arr, mid + 1, high, n); // Otherwise, peak lies on the right side
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter the size of the array: "); // Ask the user for the size of the array
        int n = scanner.nextInt();// Read the size of the array
        int[] arr = new int[n]; // Create an array of size n
        System.out.print("Enter the elements of the array (space-separated): "); // Ask the user for the elements of the array
        for (int i = 0; i < n; i++) { // Read the elements of the array
            arr[i] = scanner.nextInt(); // Read the next integer
        }
        int peakIndex = findPeakUtil(arr, 0, n - 1, n); // Find the peak element in the array
        if (peakIndex != -1) { // If a peak element is found
            System.out.println("The peak element is " + arr[peakIndex] + " at index " + peakIndex); // Print the peak element
        } else {
            System.out.println("No peak element found in the array."); // Otherwise, print that no peak element is found
        }
        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}
