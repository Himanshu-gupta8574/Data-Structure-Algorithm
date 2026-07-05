package  Recursion;

public class Max_array_value {
    public static int maxValue(int arr[], int index){

        if (index == arr.length-1) {
            return arr[index];
        }
        int smallAns = maxValue(arr, index+1);

        return Math.max(arr[index], smallAns);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,2,3,12};
        int index = 0;
        System.out.println(maxValue(arr, index));
    }
}
