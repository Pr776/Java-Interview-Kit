package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(7);
        num.add(9);

        Collections.sort(num,Collections.reverseOrder());
        int third= num.get(2);
        System.out.println(third);
    }
}
