package Recursion;

public class sum_of_array {
    public static int maxValue(int arr[], int index){
        if (index == arr.length-1) {
            return arr[index];
        }
        int sec =  maxValue(arr, index+1);
        int max = arr[index];
        return max+sec;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,2,3,6};
        int index = 0;
        System.out.println(maxValue(arr, index));
    }
}
