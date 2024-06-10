class myException extends Exception{
String s;int x;
myException(int x,String s){
this.s = s;
this.x = x;
}
public String toString()
{
return "myException Caught "+ s +" with number of arguments "+x;
}
}
class argument{
public static void main(String args[]) throws myException{
try{
if(args.length < 4){
throw new myException(args.length,"Not Enough Arguments");
}
else{
int ans = 0;
for(int i = 0;i < args.length;i++){
int x = Integer.parseInt(args[i]);
int y = x * x;
ans = ans + y;
}
System.out.println(ans);
}
}catch(myException e){
System.out.println(e);}
}
}