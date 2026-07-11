package Selection_Sort;

public class problem_1 {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == 0 && arr[j] !=  0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,42,0};
        sort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
  }
}
