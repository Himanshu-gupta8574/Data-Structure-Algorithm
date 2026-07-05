package Recursion;

public class alternateSign {
    public static int sum(int  n){
        int ans =  0;
        int  ans2 = 0;
        if(n == 1){
            return 1;
        }
        if (n%2 == 0) {
          ans = sum(n-1) - n;
        }
        else {
          ans2  = sum(n-1) + n;
        }
        return ans+ans2;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
