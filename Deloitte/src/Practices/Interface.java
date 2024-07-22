package Practices;

interface FirstInterface{
    public void myMethod();//interface method
    int age=23;//interface variable

}

interface SecondInterface{
    public void myOtherMethod();
}

class Demo implements FirstInterface,SecondInterface{ //class implement multiple interface

    @Override
    public void myMethod() {
        System.out.println("my method");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("my other method");

    }
}


public class Interface {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.myMethod();
        obj.myOtherMethod();
        System.out.println(FirstInterface.age);// we can directly access variable without creation obj.

    }
}
