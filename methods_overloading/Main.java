package methods_overloading;

public class ques1 {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Overloaded method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to concatenate two strings
    public String concatenate(String a, String b) {
        return a + b;
    }

    // Overloaded method to concatenate three strings
    public String concatenate(String a, String b, String c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Testing add methods
        System.out.println("Sum of 2 and 3: " + mathOps.add(2, 3));
        System.out.println("Sum of 1, 2, and 3: " + mathOps.add(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + mathOps.add(2.5, 3.5));

        // Testing multiply methods
        System.out.println("Product of 2 and 3: " + mathOps.multiply(2, 3));
        System.out.println("Product of 1, 2, and 3: " + mathOps.multiply(1, 2, 3));
        System.out.println("Product of 2.5 and 3.5: " + mathOps.multiply(2.5, 3.5));

        // Testing concatenate methods
        System.out.println("Concatenation of 'Hello' and ' World': " + mathOps.concatenate("Hello", " World"));
        System.out.println("Concatenation of 'Java', ' is', and ' awesome': " + mathOps.concatenate("Java", " is", " awesome"));
    }
}
