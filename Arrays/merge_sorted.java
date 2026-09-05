package Arrays;

public class merge_sorted {
    public static void main(String[] args) {
        int x = 0;
        int arr[] = {3,4,5,0,0,0};
        int arr1[] = {1,5,7};
        int k = arr.length-1;
        int m = arr1.length-1;

        for(int i=0;i<arr.length;i++){
            if (arr[i] > 0) {
                x++;
            }
        }
        x--;
        while (x >= 0 && m >= 0) {
            if (arr[x] > arr1[m]) {
                arr[k] = arr[x];
                x--;
                k--;
            }
            else{
                arr[k] = arr1[m];
                m--;
                k--;
            }
        }
        while (x >= 0) {
            arr[k] = arr[x];
            x--;
            k--;
        }
        while (m >= 0) {
            arr[k] = arr1[m];
            m--;
            k--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
