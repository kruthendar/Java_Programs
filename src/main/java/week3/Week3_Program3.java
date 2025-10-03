package week3;

public class Week3_Program3 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
