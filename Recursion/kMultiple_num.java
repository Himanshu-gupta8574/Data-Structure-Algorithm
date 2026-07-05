package Recursion;

public class kMultiple_num {
    public static void multiple(int num, int k){
        if (k ==  1) {
            System.out.println(num);
            return;
        }
        if (k == 0) {
            System.out.println(0);
            return;
        }
        multiple(num, k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        multiple(3,4 );
    }
}
