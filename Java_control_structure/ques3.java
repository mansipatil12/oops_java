
package Java_control_structure;
import java.util.Scanner; //import java scanner
public class ques3 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create new scanner object named scanner to read input
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt(); //read the integer entered by the user
        //if else for conditions
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }
    }
}
