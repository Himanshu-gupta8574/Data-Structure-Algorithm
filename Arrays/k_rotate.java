package Arrays;

public class k_rotate {
    public static void rotate(int arr[], int i, int j){
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void solution(int arr[], int k) {
        rotate(arr, 0, arr.length-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, arr.length-1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solution(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
