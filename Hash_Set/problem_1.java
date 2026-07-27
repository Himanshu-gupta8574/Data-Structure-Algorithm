package Hash_Set;

import java.util.HashSet;

public class problem_1 {
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2,300,5,99};
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        int maxstreak = 1;
        for(int num: st){
            if (!st.contains(num-1)) {    // num is starting point
                int numstreak = num;
                int currstreak = 1;
                while (st.contains(numstreak+1)) {
                    currstreak++;
                    numstreak++;
                }
                maxstreak = Math.max(currstreak, maxstreak);
            }
        }
        System.out.println(maxstreak);
    }
}
