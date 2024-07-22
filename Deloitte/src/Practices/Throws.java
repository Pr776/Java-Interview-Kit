package Practices;

public class Throws {

    //defining method
    public static int divideNum(int m, int n) throws ArithmeticException{
        int div=m/n;
        return div;
    }

    //main method
    public static void main(String[] args) {
        Throws obj=new Throws();
        try{
            System.out.println(obj.divideNum(45,0));
        }
        catch(ArithmeticException e){
            System.out.println("Number can't divided by zero");

        }
        System.out.println("Rest of the code");
    }
}
