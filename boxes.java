import java.util.Scanner;
class plate{
double length;
double width;
plate(){
System.out.println("Enter length : ");
Scanner sc = new Scanner(System.in);
length = sc.nextDouble();
System.out.println("Enter width : ");
width = sc.nextDouble();
}
}
class box extends plate{
double height;
box(){
super();
System.out.println("Enter height : ");
Scanner sc1 = new Scanner(System.in);
height = sc1.nextDouble();
}
}
class woodbox extends box{
double thickness;
woodbox(){
super();
System.out.println("Enter thickness : ");
Scanner sc2 = new Scanner(System.in);
thickness = sc2.nextDouble();
}
}
public class boxes{
public static void main(String[] args){
woodbox obj = new woodbox();
System.out.print("Length : "+obj.length+" Width : "+obj.width+" Height : "+obj.height+" Thickness : "+obj.thickness);
}
}