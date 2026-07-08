package Recursion.Recursion_String;

public class Remove_a {
    public static String remove(String s, int idx){
        if (s.length()  == idx) {
            return "";
        }
        String smalAns = remove(s, idx+1);
        char currChar = s.charAt(idx);
        if (currChar != 'a') {
            return currChar+smalAns;
        }
        else {
            return smalAns;
        }
    }
    public static void main(String[] args) {
        String sc =  "";
        String  s = "abcax";;
        System.out.println(remove(s,0));
    }
}
