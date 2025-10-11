package week4;

import java.util.Scanner;

public class Week4_Program1 {
    // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
