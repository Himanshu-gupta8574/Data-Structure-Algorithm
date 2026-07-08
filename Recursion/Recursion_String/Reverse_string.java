package Recursion.Recursion_String;

public class Reverse_string {
    public  static String reverse(String s, int idx){
        if (s.length() == idx) {
            return "";
        }
        String smalAns = reverse(s,idx+1);
        return smalAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        String  s = "aba";
        String reverse = reverse(s, 0);
        if (reverse.equals(s)) {
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrme");
        }
        
    }
}
