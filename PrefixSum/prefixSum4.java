package PrefixSum;

public class prefixSum4 {
    public static void main(String[] args) {

        int arr[] = {5,3,2,6,3,1};

        int pref[] = new int[arr.length];
        int suf[] = new int[arr.length];

        // Prefix Sum
        pref[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            pref[i] = pref[i - 1] + arr[i];
        }

        // Suffix Sum
        suf[arr.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            suf[i] = suf[i + 1] + arr[i];
        }

        boolean found = false;

        for(int i = 0; i < arr.length - 1; i++){
            if(pref[i] == suf[i + 1]){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
