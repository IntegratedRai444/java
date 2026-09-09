import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = a + b;
        if (sum > 100) {
            System.out.println("The sum is greater than 100: " + sum);
        } else {
            System.out.println("The sum is not greater than 100: " + sum);
        }
        sc.close();
    }
}