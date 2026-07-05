package Recursion;

public class gcd {
    public static void  greatestint(int d, int a, int n){
        if (d == 1) {
            System.out.println(1);
            return;
        }
        if (a%d == 0 && n%d == 0) {
            System.out.println(d);
            return;
        }
        greatestint(d-1, a, n);
    }
    public static void main(String[] args) {
        greatestint(3,3,16);
    }
}
