package Binary_Search;

public class problem_7 {
    public static void main(String[] args) {
        int arr = {1,2,5,53,545,44,33};
        int n = arr.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            boolean left = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean right = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (left && right) {
                return mid;
            }

            if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
