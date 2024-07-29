package Practices;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;
//        //convert to number to string
//        String numStr=Integer.toString(num);
//        StringBuffer str=new StringBuffer(numStr);
//        str.reverse();
//        //convert string to number
//        int reverseNumber=Integer.parseInt(str.toString());
//        System.out.println(reverseNumber);

        int reversed=0;

        while (num!=0){
            int num1=num%10;
            reversed=reversed*10+num1;
            num=num/10;

        }
        System.out.println(reversed);


    }
}
