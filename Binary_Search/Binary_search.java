package Binary_Search;

public class Binary_search {
    public static boolean search(int arr[],int target, int st, int mid, int end){
        if (st > end) {
            return false;
        }
        if (arr[mid] == target) {
            return true;
        }
        else if (target > arr[mid]) {
            st = mid+1;
            mid = (st+end)/2;
            return search(arr, target, st, mid, end);
        }
        else{
            end = mid-1;
            mid = (st+mid)/2;
            return search(arr, target, st, mid, end);
        }
        
    }
    public static boolean binarySearch(int arr[], int target){
        int st = 0;
        int end = arr.length-1;
        int mid = (st+end)/2;
        boolean sea = search(arr, target, st,mid,end);
        return sea;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 44;
        System.out.println(binarySearch(arr, target));
    }
}
