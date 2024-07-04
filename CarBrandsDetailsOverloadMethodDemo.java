import java.util.*;
public class CarBrandsDetailsOverloadMethodDemo {
        String CarName;
        double carprice;
        String owner;
        Scanner c = new Scanner(System.in);
        CarBrandsDetailsOverloadMethodDemo(){
        this.CarName=CarName;
        this.carprice=carprice;
        this.owner=owner;
        }
        
        public void CarDetails() {
        System.out.println(CarName);
        }
        public void CarDetails(String cnm,double price) {
        System.out.println(cnm);
        System.out.println(price);
    
        }
    
        public void CarDetails(String cnm1 , double price1 , String owner1 ) {
        System.out.println(cnm1);
        System.out.println(price1);
        System.out.println(owner1);
        
        }
    
        public static void main(String[] args) {
        // TODO Auto-generated method stub
        CarBrandsDetailsOverloadMethodDemo obj = new CarBrandsDetailsOverloadMethodDemo();
        obj.CarName="BMW";
        
        obj.CarDetails();
        obj.CarDetails("ABC", 140000.5); // call by value
        
        obj.CarDetails("Test", 1500000.5, "XYZ");
        
        }
    
        }

