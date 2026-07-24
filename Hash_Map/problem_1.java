package Hash_Map;

import java.util.HashMap;
import java.util.Map;

// count element of array 

public class problem_1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,1,2};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (!freq.containsKey(arr[i])) {
                freq.put(arr[i], 1);
            }
            else {
                freq.put(arr[i],freq.get(arr[i])+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxFreq = 0;
        int ansKey = -1;
        // for(var e : freq.entrySet()){
        //     if (e.getValue() > maxFreq) {
        //         maxFreq = e.getValue();
        //         ansKey = e.getKey();
        //     }
        // }
        

        for(var key: freq.keySet()){
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);  // value ati hai
                ansKey = key;
            }
        }
        System.out.println(ansKey+" "+maxFreq);
    }
}
