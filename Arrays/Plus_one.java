package Arrays;

public class Plus_one {

    public static void main(String[] args) {

        int arr[] = {9, 9, 9};

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i]++;
                break;
            }

            arr[i] = 0;
        }

        if (arr[0] == 0) {

            int arr2[] = new int[arr.length + 1];

            arr2[0] = 1;

            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }

        } else {

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}