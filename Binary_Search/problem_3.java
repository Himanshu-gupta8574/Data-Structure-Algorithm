package Binary_Search;

// index of minimum element in rotated arrar

public class problem_3 {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10,1,2,3,4};
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while (st <= end) {
            int mid = (st+end)/2;
            if (arr[mid] > arr[end]) {
                st = mid+1;
            }
            else if (arr[mid] <= arr[end]) {
                ans = mid;
                end = mid-1;
            }
        }
        System.out.println(ans);
    }
}
