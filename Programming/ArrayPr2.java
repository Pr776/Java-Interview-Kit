import java.util.Scanner;

//write a program to find out wheather a given integer is presented in an array or not.
public class ArrayPr2 {
  public static void main(String[] args) {
    int marks[]={23,34,67,89,9,100};
    int num=27;
    boolean Isinarray=false;
    for(int element:marks)
    {
        if(num==element){
           Isinarray=true;
           break;
        }
    }
    if(Isinarray){
        System.out.println("the number is present in this array");
    }
    else{
        System.out.println("the number is not present in this array");
    }
  }
}
