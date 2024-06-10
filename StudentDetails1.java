import java.util.Scanner;
class Student {

     static int roll;
     static String name;
     static double cgpa;

    public Student(int roll, String name, double cgpa)
    {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
   }
class StudentDetails 
{

    public static void main(String[] args) 
	{
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of students: ");
          int n = sc.nextInt();
          Student[] students = new Student[n];
        for (int i = 0; i < n; i++) 
	  {
            System.out.println("Enter the details of student " + i );

           
            System.out.println("Roll number: ");
            int roll = sc.nextInt();

            System.out.println("Name: ");
	    sc.nextLine();
            String name = sc.nextLine();

            System.out.println("CGPA: ");
            double cgpa = sc.nextDouble();

           
            Student student = new Student(roll, name, cgpa);
            students[i] = student;
        }
	System.out.println("\nDetails of all students:");
        for (Student student : students) 
	{
            System.out.println(student);
        }
        Student lowestCgpaStudent = students[0];
        for (int i = 1; i < n; i++) 
	{
            if (students[i].cgpa < lowestCgpaStudent.cgpa) 
	    {
                lowestCgpaStudent = students[i];
            }
        }
         System.out.println("roll:" + Student.roll);
         System.out.println("name:" + Student.name);
         System.out.println("cgpa:" + Student.cgpa);

        System.out.println("\nName of the student with the lowest CGPA: " + lowestCgpaStudent.name);
    }
}


	

  /* System.out.println("roll:" + roll);
   System.out.println("name:" + name);
   System.out.println("cgpa:" + cgpa);

     public int getRoll() 
    {
        return roll;
    }

    public String getName() 
    {
        return name;
    }

    public double getCgpa() 
    {
        return cgpa;
    }
    public String toString() 
    {
        return "Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa;
    } */
