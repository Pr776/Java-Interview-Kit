package Practices;

public class Threads extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {
        Threads obj=new Threads();
        obj.run();
    }
}


