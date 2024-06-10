

 abstract class Student {
    int rollNo;
   String regNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getinput(int rollNo, String regNo) {
    return rollNo;
    return regNo;
    }

    public abstract void course(); 
}

class Kiitian extends Student {
    @Override
    public void course() {
        System.out.println("Course B.Tech: Computer Science & engineering");
    }
}

public class question1 {
    public static void main(String[] args) {
        Kiitian kiiTianObject = new Kiitian();

        kiiTianObject.setRollNo(1);
        kiiTianObject.regNo = "ABCD123"; 

        System.out.println("Details of Kiitian Object: ");
        System.out.println("\tRoll No.: " + kiiTianObject.getInput());
        System.out.println("\tReg No.: " + kiiTianObject.getInput());
        kiiTianObject.course(); // Calls overridden method defined in Kiitian class
    }
}
