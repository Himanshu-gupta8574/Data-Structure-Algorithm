package Sliding_Window;

public class problem_1 {
    public static void main(String[] args) {

        int arr[] = {100, 200, 300, 400};

        int k = 2;
        int windowSum = 0;

        // Calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    }
}