package Array;

import java.util.Arrays;

public class SumOfelements {
    public static void main(String[] args) {
        int [] input={2,3,4,5,7};

        //sum of all elements
        int sum= Arrays.stream(input).sum();
        System.out.println("Sum of all elements:"+sum);
    }
}
