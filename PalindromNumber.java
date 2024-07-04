import java.util.*;
public class PalindromNumber {
    public static void main(String args[]) {
        System.out.println("Enter the number");
        String num;
        Scanner c = new Scanner(System.in);
        num=c.nextLine();
        
        String str1=num.toString();
        StringBuffer str1b = new StringBuffer(str1);
        
        StringBuffer str2b = str1b.reverse();
        System.out.println(str2b);
        
        String r1 = str1b.toString();
        String r2=str2b.toString();
        
        if(r1.equals(r2)) {
        System.out.println("reverse values are same");
        }
    else {
        System.out.println("reversed values are not same");
        }
        
        //int res =Integer.parseInt(num);
        
        
        
    }
        }

