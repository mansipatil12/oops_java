package DataTypes_and_variables;

public class ques2 {
    public static void main(String[] args) {
        // Implicit (Widening) Conversion: int to double
        int intValue = 10;
        double doubleValue = intValue; // Implicit conversion
        System.out.println("Implicit (Widening) Conversion: int to double");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        
        // Explicit (Narrowing) Conversion: double to int
        double doubleNum = 15.75;
        int intNum = (int) doubleNum; // Explicit conversion
        System.out.println("\nExplicit (Narrowing) Conversion: double to int");
        System.out.println("double value: " + doubleNum);
        System.out.println("int value: " + intNum);
    }
}


