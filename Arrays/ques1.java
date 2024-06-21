package Arrays;
import java.util.Scanner;
public class ques1{  
    public static int findPeakElement(int[] nums) { // Method to find a peak element in the array
        int n = nums.length;      
        if (n == 1) {         // If there's only one element, return it as the peak element
            return nums[0];
        }
        if (nums[0] >= nums[1]) { // If the first element is greater than the second, return the first element
            return nums[0];
        }
        if (nums[n - 1] >= nums[n - 2]) { // If the last element is greater than the second last, return the last element
            return nums[n - 1];
        }
        for (int i = 1; i < n - 1; i++) { // Iterate through the array to find a peak element      
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) { // Check if the current element is greater than or equal to its neighbors
                return nums[i];
            }
        } // Return -1 if no peak element is found 
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         
        System.out.print("Enter the number of elements in the array: "); // Take the size of the array as input
        int n = scanner.nextInt();
        int[] nums = new int[n];// Initialize the array with the input size
        System.out.println("Enter the elements of the array: "); // Take the array elements as input
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int peak = findPeakElement(nums); // Find the peak element in the array   
        System.out.println("The peak element is: " + peak); // Print the peak element
    }
}

