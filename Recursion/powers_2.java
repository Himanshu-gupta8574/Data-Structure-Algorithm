package Recursion;

public class powers_2 {
    public static int raisetopower(int p, int q) {
        if (q == 0) {
            return 1;
        }
        if (q % 2 == 0) {
            int smallAns = raisetopower(p, q/2);
            return smallAns*smallAns;
        }
        else{
            int smallAns = raisetopower(p, q/2);
            return p*smallAns*smallAns;
        }
    }
    public static void main(String[] args) {
        int p = 3;
        int q = 3;
        System.out.println(raisetopower(p,q));
    }
}
