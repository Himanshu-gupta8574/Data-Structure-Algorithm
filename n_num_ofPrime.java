public class n_num_ofPrime {
    public static boolean isDigitPrime(int s){     // 7,11,13......10thprime + 11th+ 12thprime
        for(int i=2;i*i<=s;i++){
            if (s%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int s = 7;
        int n = 10;
        int count = 0;
        int nthprime = 0;
        while (count < n) {
            if (isDigitPrime(s)) {
                count++;
            }
            if (count == n) {
                nthprime = s;
            }
            s++;
        }
        System.out.println(nthprime);

        int secondprime = nthprime+1;
        int vaal = nthprime;
        int t = 0;
        while (t < 2) {
            if (isDigitPrime(secondprime)) {
                vaal = secondprime+vaal;
                t++;
            }
            secondprime++;
        }
        System.out.println(vaal);
    }
}
