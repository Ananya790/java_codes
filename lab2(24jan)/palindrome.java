/*
1. wap to check user entered number is palindrome or not
*/

import java.util.Scanner; 
class palindrome{
	public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:  ");
	int n = sc.nextInt();
	System.out.println("NUMBER= " + n);
	int i , sum=0, temp;
        
	temp=n;
	while(n>0)
	{
	 i=n%10;
	sum=(sum*10)+i;
	n=n/10;
	 }
     if (temp==sum)
	System.out.println("number is palindrome");
     else
	System.out.println("number is not palindrome");

}
}
	  
	