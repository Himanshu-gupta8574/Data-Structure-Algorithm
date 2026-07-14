package Insertion_Sort;

public class problem_3 {
    public static void main(String[] args) {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        int n = arr.length - 1;
        int st = 0;
        int end = n;
        while (st < end) {
            if (arr[st] > 0 && arr[end] < 0) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
            else if (arr[st] < 0) {
                st++;
            }
            else end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }    
}
