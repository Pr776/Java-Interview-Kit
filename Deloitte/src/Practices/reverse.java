package Practices;

public class reverse {
    public static void main(String[] args) {
        String str="priyanka";
         String reverseStr="";

         for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
             reverseStr=ch+reverseStr;

         }
        System.out.println(reverseStr);
    }
}
