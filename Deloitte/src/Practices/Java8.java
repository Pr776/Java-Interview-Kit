package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        List<String> string= Arrays.asList("Orange" ,"Banana","bpple");
        List<String> result = string.stream()
                .filter(str -> str.toLowerCase().startsWith("b"))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
