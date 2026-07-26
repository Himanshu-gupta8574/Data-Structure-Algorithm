package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class problem_4 {
    public static void main(String[] args) {
        Map <Character, Character> freq = new HashMap<>();
        String s = "abcdca";
        String t = "xywswx";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char ck = t.charAt(i);
            if (!freq.containsKey(ch)) {
                freq.put(ch, ck);
            }
            else{
                if (freq.get(ch) != ck) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }
}
