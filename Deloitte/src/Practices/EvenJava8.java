package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//checked all the numbers are even in a list by using java8
public class EvenJava8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number separated by spaces");
        String input=scanner.nextLine();

//       List<Integer> list=Arrays.asList(2,4,8,6);
//       Boolean result=list.stream().allMatch(n -> n%2==0);


        List<Integer> list =Arrays.stream(input.split("\\s+"))
                //converts each string in a string to integer
                .map(Integer::parseInt)
                //collect the integer object into a string
                .collect(Collectors.toList());

        Boolean result=list.stream().allMatch(n -> n%2==0);

       if(result){
           System.out.println("All are even in list");
       }
       else {
           System.out.println("All are not even in list");
       }
    }
}
