package Two_pointer;

public class problem_3 {
    public static void main(String[] args) {
        int arr[] = {1,4,7,10};
        int arr2[] = {15,12,8,3};
        int arr3[] = new int[arr.length+arr2.length];
        int i = 0;
        int j = arr2.length-1;
        int k = 0;
        while(i < arr.length && j >= 0){
            if (arr[i] < arr2[j]) {
                arr3[k] = arr[i];
                k++;
                i++; 
            }
            else if (arr[i] > arr2[j]) {
                arr3[k] = arr2[j];
                k++;
                j--;
            }
        }
        while (i < arr.length) {
            arr3[k] = arr[i];
            k++;
            i++;
        }
        while (j >= 0) {
            arr3[k] = arr2[j];
            k++;
            j--;
        }
        for(k=0;k<arr3.length;k++){
            System.out.println(arr3[k]);
        }
    }
}
