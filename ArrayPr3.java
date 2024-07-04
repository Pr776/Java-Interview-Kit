//calculate the average marks from an arrray containing marks of all students in physics using for each loop.
public class ArrayPr3 {
    public static void main(String[] args) {
        int marks[]={56,87,90,100,45,32};
        int sum=0;
        int avg=0;
        for(int element:marks){
            sum=sum+element;
            avg=sum/marks.length;
        }
        
        System.out.println(avg);

    }
}
