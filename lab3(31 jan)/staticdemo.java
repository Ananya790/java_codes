/* WAP TO DEMO STATIC */

class box {
int h,w,l;
box(){
        h=5;
	w=5;
        l=5;
}
}
class test{
static int count= 0;
public static void main(String[] args){
	box b1 = new box();
	count++;
	box b2 = new box();
	count++;
	box b3 = new box();
	count++;
	System.out.println("the no. of box created  " + count);
}
}