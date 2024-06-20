

import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        // Read the input
        Scanner scanner = new Scanner(System.in);
        // user will enter their score
        System.out.println("Enter your score (0-100): ");
        int score = scanner.nextInt();

        // Calculate the grade using if-else statements
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        // Print the grade
        System.out.println("Your grade is: " + grade);
    }
}
