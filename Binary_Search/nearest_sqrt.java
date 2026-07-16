package Binary_Search;

public class nearest_sqrt {
    public static void main(String[] args) {
        int x = 24;
        int ans = -1;
        int st = 0;
        int end = x;

        while (st <= end) {
            int mid = (st+end)/2;
            if (x == mid*mid) {
                ans = mid;
                return;
            }
            else if (mid*mid > x){
                end = mid-1;
            }
            else{
                ans = mid;
                st = mid+1;
            }
        }
        System.out.println(ans);
    }
}
