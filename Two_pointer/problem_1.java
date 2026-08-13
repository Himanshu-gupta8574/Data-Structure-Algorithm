package Two_pointer;

public class problem_1 {
    public static void main(String[] args) {
        int arr[] = {0,0,1,0,1,0,1,1,0};
        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            if(arr[i] == 0 ){
                i++;
                //j--;
            }
            else if(arr[i] == 1 && arr[j] == 0) {
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
