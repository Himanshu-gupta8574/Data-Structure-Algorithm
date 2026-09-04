package Arrays;

public class remove_ele {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,7};
        int i = 0;
        int j = arr.length-1;
        int val = 2;
        while (i <= j) {
            if (arr[i] == val && arr[j] != val) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else i++;
        }
        for(int h=0;h<arr.length;h++){
            System.out.println(arr[h]);
        }
        //System.out.println(j-1);
    }
}
