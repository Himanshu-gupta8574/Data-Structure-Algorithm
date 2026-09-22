package Hash_Map;
import java.util.HashMap;
import java.util.Map;

public class problem_10 {

    public static void main(String[] args) {

        Map<Integer, Integer> mp = new HashMap<>();

        int arr[] = {1, 4, 1, 3, 2, 4};

        int temp[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
                temp[k++] = arr[i];
            }
        }

        int arr2[] = new int[k];

        for (int i = 0; i < k; i++) {
            arr2[i] = temp[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        int i = 0;
        int j = arr2.length-1;
        while (i < j) {
            int tem = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = tem;
            i++;
            j--;
        }
        System.out.println();
        for (int q = 0; q < arr2.length; q++) {
            System.out.print(arr2[q]);
        }
    }
}
