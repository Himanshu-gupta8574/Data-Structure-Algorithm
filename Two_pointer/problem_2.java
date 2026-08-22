package Two_pointer;

public class problem_2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            if (arr[i] % 2 == 0) {
                i++;
            }
            else if (arr[i] % 2 != 0 && arr[j] % 2 == 0 ) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
