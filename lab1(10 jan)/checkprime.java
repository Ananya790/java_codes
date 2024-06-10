// whether no. is prime
class checkprime{
public static void main(String[] args)
{
int n=7,i=2,flag=0;
while(i<=n/2)
{
if(n%i==0)
flag=1;
i++;
}

if(flag==1)
    System.out.print("no. is not prime");
else
    System.out.print("no. is  prime");    



}
}