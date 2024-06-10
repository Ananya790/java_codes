/*
4. wap to take first name and last name from user and print both in one line as last name followed by first name
*/
import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fisrtname");
        String firstname =  sc.nextLine();
        System.out.println(firstname);

        System.out.println("enter lastname");
        String lastname =  sc.nextLine();
        System.out.println(lastname);

        System.out.println("your name is :  " + lastname + "  " + firstname);



    }
}