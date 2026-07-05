package Recursion;
import java.util.Scanner;

public class print_1_to_n {
    public static void printIncreasing(int n){
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printIncreasing(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
