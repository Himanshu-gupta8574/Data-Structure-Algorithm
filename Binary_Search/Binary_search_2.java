package Binary_Search;

public class Binary_search_2 {
    public static boolean search(int arr[], int target){
        int st = 0;
        int end = arr.length - 1;
        int mid = (st+end)/2;
        while (st < end) {
            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,6,8};
        int target = 0;
        while (target != 10) {
            System.out.println(search(arr, target));
            target++;
        }
    }
}
