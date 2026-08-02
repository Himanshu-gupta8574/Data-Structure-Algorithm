package Binary_Search;

public class problem_8 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,2,3,1,1};
        int st = 0;
        int end = arr.length-1;
        int tar = 2;
        while (st <= end) {
            int mid = st+(end-st)/2;
            if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
                //continue;
            }
            else if (arr[mid] == tar) {
                System.out.println(mid);
                return;
            }
            else if (arr[mid] <= arr[end]) {
                if (arr[mid] < tar && arr[end] > tar) {
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if (arr[st] <= tar && arr[end] > tar) {
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
    }
}
