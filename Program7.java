import java.util.Scanner;
public class Program7 {
    public static void main(String [] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt(); 
         String dayname; 
         switch (day) { 
             case 1: dayname = "Monday"; 
             break; 
             case 2: dayname = "Tuesday"; 
             break; 
             case 3: dayname = "Wednesday"; 
             break; 
             case 4: dayname = "Thursday"; 
             break; 
             case 5: dayname = "Friday"; 
             break; 
             case 6: dayname = "Saturday"; 
             break; 
             case 7: dayname = "Sunday"; 
             break; 
             default: dayname = "Invalid day"; 
         }
           System.out.println("day " +  day + " is " + dayname);
    }
}