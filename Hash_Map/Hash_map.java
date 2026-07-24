package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {
    public static void main(String[] args) {
        Map <String, Integer> mp = new HashMap<>();
        mp.put("shalu", 21);
        mp.put("shreash",14);
        mp.put("shreya", 19);

        mp.put("akash",21);
        mp.remove("alash");

        mp.putIfAbsent("yashika",21 );

        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
    }
}
