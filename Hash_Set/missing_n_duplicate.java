package Hash_Set;

import java.util.HashMap;
import java.util.Map;

public class missing_n_duplicate {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5,6,6};
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if (!mp.containsKey(i)) {
                System.out.println(i);
            }
            if (mp.containsKey(i) && mp.get(i) > 1){
                System.out.println(i);
            }
        }
    }
}
