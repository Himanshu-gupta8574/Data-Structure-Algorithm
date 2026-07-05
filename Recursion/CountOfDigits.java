package Recursion;

public class CountOfDigits {

    public static int count(int n) {
        if (n >= 0 && n <= 9) {
            return 1;
        }

        return 1 + count(n / 10);
    }
    

    public static void main(String[] args) {
        System.out.println(count(1234));   // 4
        System.out.println(count(7));      // 1
        System.out.println(count(98765));  // 5
    }
}