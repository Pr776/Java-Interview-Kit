//Write a Java program to find the maximum element in an array
public class Array_pr6 {
    public static void main(String[] args) {
        int arr[]={67,98,98777,45,56};
        int max=0;
        for(int element:arr){
           if(element>max)
           {
            max=element;
           }
        }
        System.out.println("the maximum element in this array is " + max);
    }
}
