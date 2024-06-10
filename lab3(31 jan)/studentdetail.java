// 2. wap to input and display the details of n no. of students having rollno,name,cgpa as data members. also display the name of the student having lowest cgpa

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cpa;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter roll number: ");
        roll = scanner.nextInt();
        
        System.out.print("Enter name: ");
        scanner.nextLine(); 
        name = scanner.nextLine();
        
        System.out.print("Enter CGPA: ");
        cpa = scanner.nextDouble();
    }
}

public class studentdetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputDetails();
        }
        double lowestCGPA = Double.MAX_VALUE;
        String lowestCGPAStudentName = "";
        for (int i = 0; i < n; i++) {
            if (students[i].cpa < lowestCGPA) {
                lowestCGPA = students[i].cpa;
                lowestCGPAStudentName = students[i].name;
            }
        }
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Roll Number: " + students[i].roll);
            System.out.println("Name: " + students[i].name);
            System.out.println("CGPA: " + students[i].cpa);
            System.out.println();
        }
        System.out.println("Student with the lowest CGPA: " + lowestCGPAStudentName);
    }
}
