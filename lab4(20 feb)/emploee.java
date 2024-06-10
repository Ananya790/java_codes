import java.util.Scanner;
interface employee{
    void getdetails();
    }
interface manager extends employee{
    void getdeptdetails();
    }
class head implements manager{
    String Ename;
    int Eid;
    int Deptid;
    String Deptname;
    public void getdetails(){
        System.out.println("Enter the Eid : ");
        Scanner sc = new Scanner(System.in);
        Eid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Ename : ");
        Ename = sc.nextLine();
    }
    public void getdeptdetails(){
        System.out.println("Enter the Deptid : ");
        Scanner sc = new Scanner(System.in);
        Deptid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Deptname : ");
        Deptname = sc.nextLine();
    }
    public void display(){
        System.out.println("Eid : "+Eid);
        System.out.println("Ename : "+Ename);
        System.out.println("Deptid : "+Deptid);
        System.out.println("Deptname : "+Deptname);
    }
}
class emploee{
public static void main(String[] args){
    head obj = new head();
    obj.getdetails();
    obj.getdeptdetails();
    obj.display();
}
}