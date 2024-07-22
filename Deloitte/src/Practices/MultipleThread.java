package Practices;


class Example extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("hi");
        }
    }
}
class Example2 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("hello");
        }
    }
}

public class MultipleThread {
    public static void main(String[] args) {
        Example obj1=new Example();
        Example2 obj2=new Example2();
        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();
    }
}
