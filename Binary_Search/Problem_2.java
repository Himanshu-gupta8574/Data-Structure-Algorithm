package Binary_Search;

public class Problem_2 {
    public static int search(int arr[], int target){
        int st = 0;
        int end = arr.length - 1;
        int idx = -1;
        
        while (st <= end) {
            int mid = (st+end)/2;
            if (arr[mid] == target) {
                idx = mid;
                end = mid - 1;
            }
            else if (arr[mid] < target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,5,5,6,6,6,8,9,9,9};
        int target = 9;
        System.out.println(search(arr, target));
    }
}
