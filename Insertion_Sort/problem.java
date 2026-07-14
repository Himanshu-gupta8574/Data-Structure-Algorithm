package Insertion_Sort;

public class problem {
    public static void sort(int[] arr) {
    int x = -1;
    int y = -1;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1]) {
            x = i - 1;
            break;
        }
    }

    for (int i = arr.length - 2; i >= 0; i--) {
        if (arr[i] > arr[i + 1]) {
            y = i + 1;
            break;
        }
    }

    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}
    public static void main(String[] args) {
        int arr[] = {3,8,6,7,5,7,9,10};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
