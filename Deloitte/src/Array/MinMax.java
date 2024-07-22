package Array;

public class MinMax {
    public static void main(String[] args) {
        int [] array={3,2,5,6,8,9};
        int min=array[0];
        int max=array[0];

        for(int i=0;i< array.length;i++){
            if(array[i]< min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }

        }
        System.out.println("smallest number:"+min);
        System.out.println("Highest number:"+max);
    }
}
