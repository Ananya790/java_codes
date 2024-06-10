/*
1.wap to get user input from console using scanner class
*/
 
class palindrome{
	public static void main(String[] args)
{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:  ");
	int number = sc.nextInt();
	System.out.println(n);
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
	  
	