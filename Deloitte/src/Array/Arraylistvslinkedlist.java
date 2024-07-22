package Array;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylistvslinkedlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        LinkedList<Integer> link=new LinkedList<>();

        long startTime;
        long endTime;
        long elapsedTime;
       for(int i = 0; i<1000000; i++){
           arr.add(i);
           link.add(i);
 }

        //Linkedlist implementation
        startTime= System.nanoTime();
       link.get(0);
       endTime=System.nanoTime();
       elapsedTime=endTime-startTime;
       System.out.println("Linkedlist\n"+ elapsedTime+"ns");

        //arraylist implementation
        startTime= System.nanoTime();
        arr.get(0);
        endTime=System.nanoTime();
        elapsedTime=endTime-startTime;
        System.out.println("Arraylist\n"+ elapsedTime+"ns");

    }
}
