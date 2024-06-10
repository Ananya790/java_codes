/*
3.wap to weekday for the  given day number of the current month using switch case statement
*/
import java.util.Scanner;
class weekday{
	public static void main(String[] args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter weekday: ");
	int daynum = sc.nextInt();
	String day;
	
	
	switch(daynum % 7)
        {
            case 1 :
              day="monday";
            break;

            case 2 :
               day="tuesday";
                break;
	   case 3:
	     day="wednesday";
	     break;
            case 4:
	      day="thursday";
	      break;
	 case 5:
	      day="friday";
	      break;
	 case 6:
	      day="saturday";
	      break;
	 case 7:
	      day="sunday";
	      break;
            default :
                day = " invalid";
	       break;
        }
     System.out.println("weekday is   "+ day);
    }}

	