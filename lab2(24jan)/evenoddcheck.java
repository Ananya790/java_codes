 import java.util.Scanner;
 class evenoddcheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int i;
        i=sc.nextInt();
        for (i=1;i<=10;i++)
        {
          System.out.println("Even nos. are :-");
        for (int j=0;j<i;j++)
        {
           
            if(j%2==0)
            { 
                System.out.println(j);
            }
        }
        System.out.println("Odd nos. are:-");
        for(int k=0;k<i;k++)
        {
           
            if(k%2!=0)
            { 
                System.out.println(k);
            }
        }
       }
    }
}
