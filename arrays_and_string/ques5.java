package arrays_and_string;
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: "); // Take input for the size of the arrays
        int n = scanner.nextInt();
        int[] rollNumbers = new int[n];// Arrays to store roll numbers, names, and marks
        String[] names = new String[n];
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) { // Input values for roll numbers, names, and marks
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Marks: ");
            marks[i] = scanner.nextInt();
        }    
        displayStudentInfo(rollNumbers, names, marks); // Display student information using a function
        scanner.close();
    }
    public static void displayStudentInfo(int[] rollNumbers, String[] names, int[] marks) { // Function to display student information
        System.out.println("\nStudent Information:");
        System.out.println("Roll No\tName\tMarks");
        for (int i = 0; i < rollNumbers.length; i++) {
            System.out.println(rollNumbers[i] + "\t" + names[i] + "\t" + marks[i]);
        }
    }
}
