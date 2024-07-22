package Practices;
@FunctionalInterface
interface adder{
    int add(int a, int b);

}
public class Lambda {
    public static void main(String[] args) {
        adder adr=(a,b)->(a+b);
        int result= adr.add(2,7);
        System.out.println(result);
    }

}
