//Initialize a character variable in a program and if the value is alphabet then print "Alphabet" if it ís a number then print "Digit" and for other characters print "Special Character".
package arrays_and_string;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Read a character from the user

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
        
        scanner.close();
    }
}


