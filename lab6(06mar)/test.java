import java.util.Scanner;
import java.util.*;
class HrsException extends Exception {
HrsException(String s) {
super(s);
}
}
class MinException extends Exception {
MinException(String s) {
super(s);
}
}
class SecException extends Exception {
SecException(String s) {
super(s);
}
}
public class test {
int hours;
int minutes;
int seconds;
public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
if (hours > 24 || hours < 0) {
throw new HrsException("InvalidHourException: hour is not greater than 24");
} else if (minutes > 60 || minutes < 0) {
throw new MinException("InvalidMinuteException: minute is not greater than 60");
} else if (seconds > 60 || seconds < 0) {
throw new SecException("InvalidSecondException: second is not greater than 60");
} else {
this.hours = hours;
this.minutes = minutes;
this.seconds = seconds;
System.out.println(hours + ":" + minutes + ":" + seconds);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
test time = new test();
try {
System.out.println("Enter Hours:");
int a = sc.nextInt();
System.out.println("Enter Minutes:");
int b = sc.nextInt();
System.out.println("Enter seconds:");
int c = sc.nextInt();
time.setTime(a, b, c);
} catch (Exception ex) {
System.out.println("Caught the exception");
System.out.println("Exception occurred: " + ex.getMessage());
}
}
}