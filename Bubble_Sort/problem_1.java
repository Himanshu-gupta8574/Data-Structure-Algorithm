package Bubble_Sort;

public class problem_1 {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            //boolean find = false;
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j] != 0 && arr[j+1] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,45,0,0};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
