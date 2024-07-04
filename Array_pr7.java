//Write a Java program to find whether an array is sorted or not.
public class Array_pr7 {
    public static void main(String[] args) {
        //int arr[]={67,98,98777,45,56};
        int arr[]={1,2,3,4,5,6};
        boolean Issorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                Issorted=false;
                break;
            }
        }
        if(Issorted){
            System.out.println("This array is sorted");
        }
        else{
            System.out.println("this array is not sorted");
        }
    }
}
