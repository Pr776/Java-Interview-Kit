import java.util.Scanner;
public class ar {
    public static void main(String[] args) {


        int i;
        Object obj[] = new Object[5]; //obj is an object array
        Scanner c = new Scanner(System.in);
        
        for(i=0;i<=obj.length-1;i++) {
       //obj[i]=c.nextDouble();
        obj[i]=c.nextInt();
        
        }
        
        for(i=0;i<=obj.length-1;i++) {
        System.out.print(obj[i] + " " );
        
        }  
    }
} 


