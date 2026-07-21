package Binary_Search;

public class problem_4 {
    public static void main(String[] args) {
        int arr[] = {6,7,8,9,10,11,12,1,2,3,4,5};
        int st = 0;
        int end = arr.length-1;
        int target = 7;
        while (st < end) {
            int mid = (st+end)/2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            else if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid-1;
                }
                else {
                    st = mid+1;
                }
            }
        }
    }
}
