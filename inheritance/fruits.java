import java.util.Scanner;
class Apple{
public void show(){
System.out.println("Apple is red in colour");
}
}
class Banana extends Apple{
public void show(){
System.out.println("Banana is yellow in colour");
}
}
class Cherry extends Apple{
public void show(){
System.out.println("Cherry is a fruit and is red in colour");
}
}
class fruits{
public static void main(String[] args){
Apple ob = new Apple();
Apple obj = new Banana();
Apple obj1 = new Cherry();
obj.show();
obj1.show();
ob.show();

//Cherry obj2 = new Cherry();
//Apple r;
//r=obj;
//r.show();
//r=obj1;
//r.show();
//r=obj2;
//r.show();
}
}