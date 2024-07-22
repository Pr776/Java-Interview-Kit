package Practices;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map <String,Integer>students= new HashMap<String,Integer>();
        students.put("navin",78);
        students.put("hars",45);
        students.put("priyanka",89);
        students.put("priya",23);

        System.out.println(students.keySet());
        for(String key: students.keySet()){
            System.out.println(key+":"+students.get(key));
        }


    }
}
