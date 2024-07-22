package Practices;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running for runnable");
    }

    public static void main(String[] args) {
        RunnableExample r=new RunnableExample();
        Thread t1=new Thread(r);
        t1.start();
    }
}
