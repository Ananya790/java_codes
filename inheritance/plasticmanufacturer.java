import java.util.Scanner;
class twoD{
double length;
double width;
twoD(){
System.out.println("Enter the length : ");
Scanner ob = new Scanner(System.in);
length = ob.nextDouble();
System.out.println("Enter the width : ");
width = ob.nextDouble();
}
public void calculate(){
double area = length*width;
double cost = area*40;
System.out.println("Total cost of 2D sheet : "+cost);
}
}

class threeD extends twoD{
double height;
threeD(){
super();
System.out.println("Enter the height : ");
Scanner sc1=new Scanner(System.in);
height = sc1.nextDouble();
}
public void calculate1(){
double volume = length*width*height;
double cost1 = volume*60;
System.out.println("Total cost 3D box : "+cost1);
}
}
public class plasticmanufacturer{
public static void main(String[] args){
threeD obj = new threeD();
obj.calculate();
obj.calculate1();
}
}