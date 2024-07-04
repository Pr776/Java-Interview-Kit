//Write a Java program to reverse an array.
public class Array_pr5 {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,23};
        int l=arr.length;
        int n = Math.floorDiv(l, 2);
        
        for(int i=0;i<n;i++){
            //swap arr[i]=arr[l-i-1]
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }
}
