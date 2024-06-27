package arrays_and_string;
import java.util.Scanner;

public class ques7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the first 3x3 matrix
        int[][] matrix1 = new int[3][3];
        System.out.println("Enter elements for the first 3x3 matrix:");
        inputMatrixElements(matrix1, scanner);

        // Menu for operations
        int choice;
        do {
            System.out.println("\nMatrix Operations Menu:");
            System.out.println("1. Sum of all elements in matrix1");
            System.out.println("2. Transpose of matrix1");
            System.out.println("3. Add matrix1 and matrix2");
            System.out.println("4. Multiply matrix1 and matrix2");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sumMatrix1 = calculateSum(matrix1);
                    System.out.println("Sum of elements in matrix1: " + sumMatrix1);
                    break;
                case 2:
                    int[][] transposeMatrix1 = calculateTranspose(matrix1);
                    System.out.println("\nTranspose of matrix1:");
                    printMatrix(transposeMatrix1);
                    break;
                case 3:
                    // Initialize the second 3x3 matrix
                    int[][] matrix2 = new int[3][3];
                    System.out.println("\nEnter elements for the second 3x3 matrix:");
                    inputMatrixElements(matrix2, scanner);
                    
                    int[][] sumMatrix = addMatrices(matrix1, matrix2);
                    System.out.println("\nSum of matrix1 and matrix2:");
                    printMatrix(sumMatrix);
                    break;
                case 4:
                    // Initialize the second 3x3 matrix
                    int[][] matrix3 = new int[3][3];
                    System.out.println("\nEnter elements for the third 3x3 matrix:");
                    inputMatrixElements(matrix3, scanner);
                    
                    int[][] productMatrix = multiplyMatrices(matrix1, matrix3);
                    System.out.println("\nProduct of matrix1 and matrix3:");
                    printMatrix(productMatrix);
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

    // Method to input elements into a matrix
    public static void inputMatrixElements(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to calculate the sum of all elements in a matrix
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

    // Method to calculate the transpose of a matrix
    public static int[][] calculateTranspose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] productMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return productMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
