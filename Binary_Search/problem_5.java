package Binary_Search;

public class problem_5 {
    public static void first(int s, int e, int arr[], int target){
        while (s <= e) {
            int mid = (s+e)/2;
                if (arr[mid] == target) {
                    System.out.println(mid);
                    return;
                }
                else if (arr[mid] > target) {
                    e = mid-1;
                }
                else s = mid+1;
        }
    }
    public static void main(String[] args) {
        int target = 2;
        int arr[] = {3,4,5,6,7,1,2,3};
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while (st < end) {
            int mid = (st+end)/2;
            if (arr[mid] > arr[end]) {
                st = mid+1;
            }
            else if (arr[mid] <= arr[end]) {
                ans = mid;
                end = mid;
            }
        }
        System.out.println(ans);
        int s = 0;
        int e = ans-1;
        first(s,e,arr,target);
        int s2 = ans;
        int e2 = arr.length-1;
        first(s2, e2, arr, target);
    }
}
