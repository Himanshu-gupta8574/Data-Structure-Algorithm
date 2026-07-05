package Recursion;

public class sumOfDigits {
    public static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallAns =  sum(n/10);
        int ans = smallAns + n%10;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sum(513));
    }
}
