package Practices;

abstract class Car{

    public abstract void drive();
    public abstract void fly();
    public void car(){
        System.out.println("swimming");
    }}

    class Bmw extends Car{

        @Override
        public void drive() {
            System.out.println("driving");
        }

        @Override
        public void fly() {
            System.out.println("flying");
        }
    }

public class Abstract {
    public static void main(String[] args) {
        Car obj=new Bmw();
        obj.drive();
        obj.car();
        obj.fly();
        }

    }

