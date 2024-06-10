// whether no. is prime
class primenumber{
public static void main(String[] args)
{
int num=100,i=0,flag=0;
 System.out.println("primeNumbers between 1to100:");
    for (i = 1; i <= 100; i++)   
{	
    flag=0;
    for(num=i;num>=1;num--){	  	  
             if(i%num==0)
	     {
                flag=flag+1;
 		
	     }
	  }
	  if(flag==2)
 System.out.println(""+i+"");
   }
}
}