package Bubble_Sort;

public class sorting_array {
    public  static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,4};
        sort(arr);
    }
}
