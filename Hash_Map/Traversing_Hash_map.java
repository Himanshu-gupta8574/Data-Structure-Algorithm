package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Traversing_Hash_map {
    public static void main(String[] args) {
        Map <String, Integer> mp = new HashMap<>();
        mp.put("shalu", 21);
        mp.put("shreash",14);
        mp.put("shreya", 19);

        mp.put("akash",21);
        mp.remove("akash");
        System.out.println(mp.get("yash"));

        mp.putIfAbsent("yashika",21 );

        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d",key, mp.get(key) );
            System.out.println();
        }

        for(Map.Entry<String, Integer> s : mp.entrySet()){
            System.out.printf("age of%s is is %d", s.getKey(), s.getValue());
            System.out.println();
        }
        System.out.println();
        for(var s : mp.entrySet()){
            System.out.printf("age of %s is is %d", s.getKey(), s.getValue());
            System.out.println();
        }
    }
}
