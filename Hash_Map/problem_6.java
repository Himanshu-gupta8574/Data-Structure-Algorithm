package Hash_Map;
// largest subarray with sum = 0;

import java.util.HashMap;
import java.util.Map;

public class problem_6 {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0, prefSum = 0;
        mp.put(0, -1);
        for(int i=0;i<arr.length;i++){
            prefSum += arr[i];
            if (mp.containsKey(prefSum)) {
                 maxLen = i - mp.get(prefSum); //Math.max(maxLen, i-mp.get(prefSum));
            }
            else{
                mp.put(prefSum, i);
            }
        }
        System.out.println(maxLen);
    }
}
