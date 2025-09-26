package week2;

import java.util.Scanner;

public class Week2_Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double T = sc.nextDouble();

        System.out.print("Enter Rate % per annum (R): ");
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100.0;
        System.out.println("Simple Interest = " + SI);
    }
}
