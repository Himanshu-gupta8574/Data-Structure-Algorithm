package Recursion;

public class target_val {
    public static boolean  search(int arr[], int idx, int val){
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == val) return true;
        
        return search(arr, idx+1, val);
    }
    public static void main(String[] args) {
        int arr[] = {4,12,54,14,3,8,6,1};
        int val =  1;
        if (search(arr, 1, val)) {
            System.out.println("yes");
        }
        else System.out.println("no");
        //System.out.println("false");
    }
}
