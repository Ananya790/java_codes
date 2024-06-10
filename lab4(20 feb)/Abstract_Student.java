import java.util.*;
abstract class student
{
    Scanner sc=new Scanner(System.in);
    int roll,reg;
    void getinput()
    {
        System.out.println(" Roll No. :");
        roll=sc.nextInt();
        System.out.println(" Reg No. :");
        reg=sc.nextInt();
    }

    abstract void course();
}
class kiitian extends student
{
    //Scanner sc=new Scanner(System.in);
    void course()
    {
        super.getinput();
        //System.out.println("B.Tech(Computer Science & Engg.)");
        //String course=sc.nextLine();
        System.out.println("\n\nRoll No. - "+roll+"\nRegistration No. - "+reg+"\nCourse - B.Tech(Computer Science & Engg.)");
    }
}
class Abstract_Student
{
    public static void main(String[] args) 
    {
        student ob = new kiitian();
        ob.course(); 
    }
}