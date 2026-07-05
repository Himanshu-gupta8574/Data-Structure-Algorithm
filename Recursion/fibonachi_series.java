package Recursion;

import java.util.Scanner;

public class fibonachi_series {
    public  static  int fibo(int  n){
        if (n  ==  0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = fibo( n-1 );
        int prevPrev = fibo(n-2);

        return  prev+prevPrev;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter the  number :  ");
        int n =  sc.nextInt();
        System.out.println(fibo(n));
    }
}
