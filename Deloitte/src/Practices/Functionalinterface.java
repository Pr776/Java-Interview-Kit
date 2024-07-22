package Practices;

@FunctionalInterface //single method abstract
interface A{
    void show();
//    void config();
}

//class B implements A{
//    @Override
//    public void show() {
//        System.out.println("checking functional interface");
//    }
//}
public class Functionalinterface {
    public static void main(String[] args) {
        A obj =new A() {
            @Override
            public void show() {
                System.out.println("testing"); //Anonymous class
            }
        };
        obj.show();

    }
}

//A obj =() -> System.out.println("testing"); @Lambda Expression
//        obj.show();
