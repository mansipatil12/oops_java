




public class ques1 {
    public static void main(String[] args) {
        // Declare variables of each primitive data type
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;  // Use 'L' for long literals
        float floatVar = 3.14159f;       // Use 'f' for float literals
        double doubleVar = 1.2345678901234567;
        char charVar = 'a';
        boolean booleanVar = true;
        // Print each variable's value along with its data type
        System.out.println("Byte: " + byteVar + " (" + byteVar + ")");
        System.out.println("Short: " + shortVar + " (" + shortVar + ")");
        System.out.println("Integer: " + intVar + " (" + intVar + ")");
        System.out.println("Long: " + longVar + " (" + longVar + "L)");
        System.out.println("Float: " + floatVar + " (" + floatVar + "f)");
        System.out.println("Double: " + doubleVar + " (" + doubleVar + ")");
        System.out.println("Character: " + charVar + " (" + (int) charVar + ")");  // Print character value as integer
        System.out.println("Boolean: " + booleanVar + " (" + booleanVar + ")");
    }
}
