package week2;

import java.util.Scanner;

public class Week2_Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Before swap -> a=" + a + ", b=" + b);

        // XOR swap
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap  -> a=" + a + ", b=" + b);
    }
}
