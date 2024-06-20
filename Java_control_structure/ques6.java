

import java.util.Scanner;
public class ques6 {   
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //create a scanner object
        System.out.print("Input number: ");//input a number
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) { //switch statement to assign corresponding day
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        return dayName;
    }
}



