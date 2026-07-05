package Recursion;

public class powers {
    public static int rasetopower(int p, int q){
        if (q == 0) {
            return 1;
        }
        return p * rasetopower(p, q-1);
    }
    public static void main(String[] args) {
        int p = 6;
        int q = 3;
        System.out.println(rasetopower(p,q));
    }
}
