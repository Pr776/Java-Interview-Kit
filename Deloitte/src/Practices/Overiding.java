package Practices;


class Parent{
    void show(){
        System.out.println("parent show");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("child show");
    }
}
public class Overiding {
    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.show();

        Parent obj2=new Child();
        obj2.show();

    }
}
