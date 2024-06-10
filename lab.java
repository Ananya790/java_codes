import java.util.Scanner;
class account {
    int acc_no;
    int balance;
  public void input()
{
  Scanner sc = new Scanner (System.in);
  System.out.println("enter account number=");
  int acc_no =sc.nextInt();
   System.out.println("enter balance=");
  int balance=sc.nextInt();

 }

 void display()
{
 System.out.println("account number : "+acc_no);
 System.out.println("balance : "+balance);


}
}
class person extends account 
{
 String name;
 int adharno;

 void getinput(){
Scanner sc = new Scanner (System.in);
  System.out.println("enter name=");
  String name =sc.nextLine();
  System.out.println("enteradhaar number=");
  int adharno=sc.nextInt();
 
}
 void display()
{
 super.display();
 System.out.println("name : "+name);
 System.out.println("adhaar number  : "+adharno);


}

}

class lab{

 public static void main(String[] args){
  person obj = new person();

  obj.display();
  
}
}

