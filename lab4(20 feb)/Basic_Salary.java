import java.util.*;
interface salary
{
    public void earnings();
    public void deductions();
    public void bonus();
}
abstract class Manager implements salary
{
    Scanner sc=new Scanner(System.in);
    public int basic_pay=sc.nextInt();
    public void earnings()
    {
        System.out.println("Earnings - "+(basic_pay+0.80*basic_pay+0.15*basic_pay));
    }
    public void deductions()
    {
        System.out.println("Deductions - "+0.12*basic_pay);
    }
}
class Substaff extends Manager
{
    public void bonus()
    {
        System.out.println("Bonus - "+0.50*basic_pay);
    }
}
class Basic_Salary
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Basic Salary :\n");
        Manager obj =new Substaff();
        obj.earnings();
        obj.deductions();
        obj.bonus();
    }
}