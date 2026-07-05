package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int smallAns = fact(n-1);
        smallAns  = smallAns*n;
        return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number : ");
        int n =  sc.nextInt();
        System.out.println(fact(n));
    }
}
