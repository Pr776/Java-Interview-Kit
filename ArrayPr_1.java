/*create an array of 5 floats and calculate their sum */
public class ArrayPr_1 {
   public static void main(String[]args){
    float numbers[]={23.5f,67.7f,5.6f,6.7f,7.7f};
    float sum=0;
    for(float element:numbers){
      sum= sum + element;
    }
    System.out.println("the number is "+ sum);
   } 
}
