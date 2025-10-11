package week4;

import java.util.Scanner;

public class Week4_Program3 {
    // Method to reverse and print an array
    static void reverseArray(int[] arr) {
        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        reverseArray(arr);
    }
}
