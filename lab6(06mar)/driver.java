import java.util.*;
class NegativeNumberExcept {
    void ProcessInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        try
        {
            if(n<0) throw new Exception();
            else
        {
            System.out.println("Double Value:"+(2*n));
        }
        }
        catch(Exception ex)
        {
            System.out.println("Caught the Exception");
            System.out.println("Exception occurred: NegativeNumberException: number should be positive");
        }
        }
    }
class driver
{
    public static void main(String[] args) {
        NegativeNumberExcept obj=new NegativeNumberExcept();
        obj.ProcessInput();
    }
}