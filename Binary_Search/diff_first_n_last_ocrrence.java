package Binary_Search;

public class diff_first_n_last_ocrrence {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4,5,5};
        int tar = 2;
        int i = 0;
        int j = arr.length-1;
        int first = 0;
        int last = 0;
        while (i < j) {
            int mid = (i+j)/2;
            if (tar == arr[mid]) {
                first = mid;
                j = mid-1;
            }
            else if (tar < mid) {
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        System.out.println(first);

        int n = 0;
        int k = arr.length-1;
        while (n < k) {
            int mid = (n+k)/2;
            if (tar == arr[mid]) {
                last = mid;
                n = mid+1;
            }
            else if (tar < arr[mid]) {
                k = mid-1;
            }
            else{
                n = mid+1;
            }
        }
        System.out.println(last);
        System.out.println(last - first);
    }
}
