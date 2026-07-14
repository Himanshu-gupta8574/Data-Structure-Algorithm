package Insertion_Sort;

// in linear time;

public class problem_2 {
    public static void main(String[] args) {
        int arr[] = {3,8,6,7,5,9,10};
        int x = -1;
        int y = -1;
        for(int i=1;i<arr.length;i++){
            if (arr[i-1] > arr[i]) {
                if (x == -1) {
                    x = i-1;
                    y = i;
                }
                else{
                   y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
