package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class problem_2 {
    public static void main(String[] args) {
        Map<Character, Integer> freq = new HashMap<>();
        String s = "listen";
        String ck = "silent";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!freq.containsKey(ch)) {
                freq.put(ch, 1);
            }
            else {
                freq.put(ch, freq.get(ch)+1);
            }
        }
        System.out.println(freq);

        if (s.length() != ck.length()) {
            System.out.println("false");
            return;
        }
        for(int i=0;i<ck.length();i++){
            char ch = ck.charAt(i);
            if (!freq.containsKey(ch)) {
                System.out.println("false");
                return;
            }
            else {
                freq.put(ch,freq.get(ch)-1);
            }
        }
        int maxFreq = 0;
        for(var key: freq.keySet()){
            if (freq.get(key) > maxFreq) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
