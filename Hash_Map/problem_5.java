package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class problem_5 {
    public static void main(String[] args) {
        Map<Integer, Integer> freq = new HashMap<>();
        int arr[] = {14,7,10,4,5,9,1,2};
        int target = 13;
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],i);
        }
        System.out.println(freq);

        for(var e: freq.keySet()){
            int ans = target - e;
            if (freq.containsKey(ans)) {
                System.out.println(freq.get(e)+" "+freq.get(ans));
                return;
            }
        }
        System.out.println(-1);
    }
}

// //if (freq.containsKey(ans)) {
//                 System.out.println(freq.get(e)+" "+freq.get(ans));
//                 return;
//             }
//             else System.out.println(-1);
//         }
