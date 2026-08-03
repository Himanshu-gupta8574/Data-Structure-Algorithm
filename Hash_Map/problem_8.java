package Hash_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class problem_8 {

    public static int[] intersection(int[] arr1, int[] arr2) {

        int[] arr = new int[Math.min(arr1.length, arr2.length)];
        int ans = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            mp.put(arr1[i], 1);
        }

        for (int i = 0; i < arr2.length; i++) {

            if (mp.containsKey(arr2[i])) {
                arr[ans++] = arr2[i];
                mp.remove(arr2[i]);
            }
        }

        return Arrays.copyOf(arr, ans);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        int[] result = intersection(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}