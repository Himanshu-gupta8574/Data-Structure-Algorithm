package Arrays;

public class max_profit {
    public static void solution(int arr[]){
        int max = Integer.MIN_VALUE;
        int profit = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if ((arr[j] - arr[i]) > max) {
                    max = arr[j]-arr[i];
                }
            }
        }
        profit = max;
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,6,5,0,3};
        solution(arr);
    }
}
