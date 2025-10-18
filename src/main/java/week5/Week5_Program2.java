package week5;

class Student {
    // Attributes
    String name;
    int marks1, marks2, marks3;

    // Constructor
    Student(String n, int m1, int m2, int m3) {
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        int total = marks1 + marks2 + marks3;
        return (total / 3.0);
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class Week5_Program2 {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Alex", 85, 90, 88);
        Student s2 = new Student("Bob", 78, 82, 80);

        // Display details
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
