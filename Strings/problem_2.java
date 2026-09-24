package Strings;

import java.util.HashMap;
import java.util.Map;

public class problem_2 {
    public static void main(String[] args) {
        String str = "abcdabe";
        String ans = " ";
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            String temp = " ";
            for(int j=i;j<str.length();j++){
                char ch = str.charAt(j);
                if (!mp.containsKey(ch)) {
                    mp.put(ch, 1);
                    temp += ch;
                }
                else{
                    break;
                }
            }
            if (temp.length() > ans.length()) {
                ans = temp;
            }
            mp.clear();
        }
        System.out.println(ans);
    }
}
