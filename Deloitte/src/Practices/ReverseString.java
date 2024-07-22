package Practices;

public class ReverseString {
    public static void main(String[] args) {
        String str="abc";
        StringBuffer stb=new StringBuffer(str);
        stb.reverse();
        System.out.println(stb);


    }
}
