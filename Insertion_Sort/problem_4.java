package Insertion_Sort;

public class problem_4 {
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0,0};
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 0) {
                count_0++;
            }
            else if (arr[i] == 1) {
                count_1++;
            }
            else count_2++;
        }
        int k = 0;
        while (count_0 > 0) {
            arr[k++] = 0;
            count_0--;
        }
        while (count_0 > 0) {
            arr[k++] = 0;
            count_0--;
        }
        while (count_1 > 0) {
            arr[k++] = 1;
            count_1--;
        }
        while (count_2 > 0) {
            arr[k++] = 0;
            count_2--;
        }

    }
}
