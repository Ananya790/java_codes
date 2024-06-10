/*
2. wap to print coressponding grade for a given marks using if else statement in java
*/
import java.util.Scanner;
class Grade 
{

    public static void main(String[] args) 
	{
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your mark: ");
           int mark = input.nextInt();
	   char grade;
           if (mark >= 90) 
	{
            grade = 'A';
        } 
	else if (mark >= 80) 
	{
            grade = 'B';
        }
	 else if (mark >= 70) 
	{
            grade = 'C';
        }
 	else if (mark >= 60) 
	{
            grade = 'D';
        } 
        else 
	{
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}