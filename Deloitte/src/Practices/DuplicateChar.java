package Practices;

//find duplicate characters in a strings
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1=scanner.nextLine();
//        String str1="Java Developer";
        char[] str2=str1.toCharArray();
        int count=0;
        System.out.println("Duplicate character");
        for(int i=0; i< str2.length;i++){
            count=1;
            for(int j=i+1;j< str2.length;j++){
                if(str2[i] ==str2[j] && str2[i]!=0){
                    count++;
                    str2[j]=0;
                }
            }
            if(count>1 && str2[i]!=0){
                System.out.println(str2[i]);
            }
        }


    }


}
