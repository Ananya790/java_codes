,//1. wap to find no. of object created out of the class static modifier, create a class student

class student
{
int roll;
String name,subject,university;
student()
    {
        roll=24;
	name="khushi";
	subject="english";
	university="KIIT";
    }
}
class test{
static int count= 0;
public static void main(String[] args){
	student s1 = new student();
	count++;
	student s2 = new student();
	count++;
	student s3 = new student();
	count++;
	student s4= new student();
	count++;
	System.out.println("the no. of object created  " + count);
}
}