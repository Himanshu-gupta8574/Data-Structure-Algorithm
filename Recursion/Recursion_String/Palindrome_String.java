package Recursion.Recursion_String;

public class Palindrome_String {
    public  static  boolean palindrome(String  sc, int l, int r){
        if (l>=r) {
            return true;
        }
        return (sc.charAt(l) == sc.charAt(r) &&  palindrome(sc, l+1, r-1));
    }
    public static void main(String[] args) {
        String sc = "aba";
        System.out.println(palindrome(sc,0,sc.length()-1));
    }
}
