package Backtracking;

import java.util.ArrayList;
import java.util.List;;

public class printPermutation {
    public static void permutation(String str, String t, List<String> l){
        if (str.equals("")) {
            l.add(t);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            permutation(rem, t+ch, l);
        }
    }
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String str = "abc";
        permutation(str, "", l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
