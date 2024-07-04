import java.util.*;
public class ar3 {
    public static void main(String[] args) {
    int m,n; // num of rows and columns
    String Name[][] = new String[2][2];
        
    int i,j; // row index , col index
    //int m,n; // num of rows and columns
    // Scanner class object
    Scanner c = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    m=c.nextInt();
    System.out.println("Enter the number of cols:");
    n=c.nextInt();
        
// Provide input to 2d array
        
for(i=0;i<m;i++) {
 for(j=0;j<n;j++) {
        // input
        Name[i][j]=c.next();
        }
    }
        
        // Traverse the array
        for(i=0;i<m;i++) {
        for(j=0;j<n;j++) {
       // Traverse the array
 System.out.print(Name[i][j] + " ");
        
        }
    System.out.println();
        }
    }
}
