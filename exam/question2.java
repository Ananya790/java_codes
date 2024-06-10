class Thread1 extends Thread {
    public void run() {
        System.out.println("Odd Thread started.");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
        System.out.println("Odd Thread finished.");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Even Thread started.");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Thread: " + i);
        }
        System.out.println("Even Thread finished.");
    }
}

public class question2 {
    public static void main(String[] args) {
        Thread1 oddThread = new Thread1();
        Thread2 evenThread = new Thread2();

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads finished execution.");
    }
}
