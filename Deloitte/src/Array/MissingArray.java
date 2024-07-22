package Array;

import java.util.Arrays;

public class MissingArray {

    public static void main(String[] args) {

   int [] num={1,2,3,5};
  // int num1=num.length+1;

   int com=1;
   for(int i=0;i<num.length;i++){
       if(num[i]==com){
           com=com+1;
       }
       else{
           int missing=num[i]-1;
           System.out.println("the missing number is"+missing);
       }
   }


//   int sum=num1*(num1+1)/2;
//   int sumOfArray=Arrays.stream(num).sum();
//   int misssing=sum-sumOfArray;
//        System.out.println("Missing of number:"+misssing);


    }


    }


