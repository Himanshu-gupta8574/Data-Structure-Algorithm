public class repeat_val {
    public static int find(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,4};
        int repeated_value = find(arr);
        System.out.println(repeated_value);
    }
}
