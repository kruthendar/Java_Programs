package week2;

public class Week2_Program2 {
    public static void main(String[] args) {
        // Implicit (widening) conversions
        int i = 100;
        long l = i;           // int -> long
        float f = l;          // long -> float
        char c = 'Z';        // ASCII numeric value of Z = 90
        int ci = c;           // char -> int

        System.out.println("Implicit: int->long: " + l + ", long->float: " + f + ", char->int: " + ci);

        // Explicit (narrowing) conversions
        double d = 123.987;
        int di = (int) d;     // double -> int

        long big = 3_000_000_000L;
        int narrowed = (int) big;   // overflow example

        System.out.println("Explicit: double->int: " + di + " (from " + d + ")");
        System.out.println("Explicit overflow: long " + big + " -> int " + narrowed);

    }
}
