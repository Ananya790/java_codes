import java.util.Scanner;

class Account{
    int acc_no;
    double balance;

    void input(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = ob.nextInt();
        System.out.print("Enter Balance: ");
        balance = ob.nextDouble();
    }

    void disp(){
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class details{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i=0; i<3; i++){
            persons[i] = new Person();

            System.out.println("Enter details for Person "+(i+1)+":");
            persons[i].input();
            System.out.print("Enter Name: ");
            persons[i].name = ob.next();
            System.out.print("Enter Aadhar Number: ");
            persons[i].aadhar_no = ob.nextInt();
        }

        System.out.println("\nDetails of three persons:");
        for (int i=0; i<3; i++) {
            System.out.println("\nDetails for Person "+(i+1)+":");
            persons[i].disp();
        }
    }
}