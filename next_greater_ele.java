public class next_greater_ele {
    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 10, 8};
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    arr2[i] = arr[j];
                    break;
                }
            }
           
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
