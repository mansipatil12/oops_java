


public class ques3 {
    // Class-level variable (accessible throughout the class)
    public static int classVar = 10;
    public static void main(String[] args) {
        // Method-level variable (accessible only within this method)
        int methodVar = 20;
        // Loop-level variable (accessible only within this loop)
        for (int i = 0; i < 3; i++) {
            System.out.println("Inside loop: " + i);
        }
        // System.out.println("Outside loop: " + i); // This would cause an error (i not accessible)
        System.out.println("Inside main method: " + methodVar);
        System.out.println("Inside main method: " + classVar);  // Accessing class-level variable
    }
    public static void anotherMethod() {
        // methodVar would not be accessible here (specific to main method)
        System.out.println("Inside anotherMethod: " + classVar);  // Class-level variable accessible
    }
}

