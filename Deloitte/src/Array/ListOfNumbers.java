package Array;

import java.util.*;
import java.util.stream.IntStream;

public class ListOfNumbers {
    public static void main(String[] args) {

        List<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(20);
        numbers.add(5);
        numbers.add(4);
        numbers.add(50);
        numbers.add(100);
        numbers.add(80);

        //sort the list in descending order
        Collections.sort(numbers,Collections.reverseOrder());

        //find the second largest
        int secondLargest= numbers.get(1);
        System.out.println(secondLargest);

    }


}
