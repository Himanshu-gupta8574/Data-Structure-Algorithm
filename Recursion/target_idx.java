package  Recursion;

/**
 * target_idx
 */
public class target_idx {
    public static void findAllIndices(int arr[], int  idx, int target){
        if(idx == arr.length){
            return;
        }
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        findAllIndices(arr, idx+1, target);
    }
    
    public static void main(String[] args) {
        int  arr[] = {6,34,334,3,6,4,55,33,6,6};
        int  target = 6;
        findAllIndices(arr, 0, target);
    }
}