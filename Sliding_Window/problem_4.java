package Sliding_Window;

public class problem_4 {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int tar = 7;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int val = 0;
            for(int j=i;j<arr.length;j++){
                val = val+arr[j];
                if (val >= tar) {
                    min = Math.min(min, j-i+1);
                    break;
                }
            }
        }
        System.out.println(min);
    }
}
