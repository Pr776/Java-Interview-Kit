import java.util.Scanner;
class BookDetails{
      // Books info
      // class members as normal variables
    String BookName;
    int BookPages;
    double BookPrice;
    }
    public class AccessBookDetails {
    public static void main(String[] args) {
    // Object for the class BookDetails
    BookDetails obj = new BookDetails(); // Object for our ud class
    
     // This is the object for scanner class
     Scanner c = new Scanner(System.in);
     // Taking input
     System.out.println("Enter the book name");
     obj.BookName=c.next();
    
     System.out.println("Enter the book pages ");
     obj.BookPages=c.nextInt();
    
     System.out.println("Enter book price");
     obj.BookPrice=c.nextDouble();
    
    System.out.println("The book name is : " + obj.BookName);
    System.out.println("The book Pages is : " + obj.BookPages);
    System.out.println("The book price is : " + obj.BookPrice);
    
    }
    }
