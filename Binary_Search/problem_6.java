package Binary_Search;

public class problem_6 {
    public static void main(String[] args) {
        int arr[] = {2,4,10,7,3,1,0};
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while (st <= end) {
            int mid = (st+end)/2;
            if (arr[mid]<arr[mid+1]) {
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(ans);
    }
}
