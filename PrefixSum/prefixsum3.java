package PrefixSum;

import java.util.Scanner;

public class prefixsum3 {
    public static void sumOf(int l, int r, int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        int ans = arr[r] - arr[l-1];
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int  arr[] = {0,2,4,1,3,6,5};
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the  value of l");
        int l = sc.nextInt();

        System.out.println("enterthe value of r");
        int r  = sc.nextInt();
        
        sumOf(l,r,arr);
    }
}
