package Practices;

public class Throw {

    //defining method

    public static void CheckNum(int num){
        if(num<1){
            throw new ArithmeticException("\n number is negative");

        }
        else {
            System.out.println("square "+ num+ "is"+  (num*num));
        }

    }
    public static void main(String[] args) {
        Throw obj=new Throw();
        obj.CheckNum(-3);
        System.out.println("Rest of the code");

    }
}
