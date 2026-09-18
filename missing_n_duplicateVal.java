public class missing_n_duplicateVal {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5,6,6};
        int i = 0;
        while (i < arr.length) {
            if (i != arr[i]) {
                System.out.println(i);
                break;
            }
            i++;
        }
        for(int j=1;j<arr.length;j++){
            if (arr[j-1] == arr[j]) {
                System.out.println(arr[j]);
                return;
            }
        }
    }
}
