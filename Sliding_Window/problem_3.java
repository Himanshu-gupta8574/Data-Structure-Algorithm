package Sliding_Window;

public class problem_3 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        int max = 0;
        for(int i=0;i<=arr.length-k;i++){
            int val = 0;
            for(int j=i;j<i+k;j++){
                val = val+arr[j];
            }
            max = Math.max(max, val);
        }
        System.out.println(max);
    }
}
