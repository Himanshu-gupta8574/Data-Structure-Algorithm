package Sliding_Window;

public class problem_2 {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int j = 0;
        int sum = 0;
        int tar = 7;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            while (sum >= tar) {
                min = Math.min(min, i-j+1);
                sum = sum - arr[j];
                j++;
            }
        }
        System.out.println(min);
    }
}


// int arr[] = {4,5,6,7,8,9,4};
//         int target = 8;
//         int low = 0;
//         int sum = 0;
//         int minLen = Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             sum = sum+arr[i];
//             while (sum >= target) {
//                 minLen = Math.min(minLen, i-low+1);
//                 sum = sum-arr[low];
//                 low++;
//             }
//         }
//         System.out.println(minLen);