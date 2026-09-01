package Two_pointer;

public class remove_duplicate {
    public static void solution(int arr[]){
        int j = 1;
        for(int i=1;i<arr.length;i++){
            if (arr[i] != arr[i-1]) {
                arr[j++] = arr[i]; 
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4};
        solution(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
