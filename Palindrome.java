import java.util.*;
public class Palindrome {
    public static void main(String args[])  
   {  
      String r1, reverse = ""; // Objects of String class  
      System.out.println("enter a number");
      Scanner c = new Scanner(System.in);   
 
      r1 = c.nextLine();   
      int length = r1.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + r1.charAt(i);  
      if (r1.equals(reverse))  
         System.out.println("number is a palindrome.");  
      else  
         System.out.println("number isn't a palindrome.");   
   }  
}  


