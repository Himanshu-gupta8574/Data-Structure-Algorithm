package practise;
public class one {
    public static int fact(int n){
        if (n==1 ||  n==0) {
            return 1;
        }
        int  tact = fact(n-1);
        int tact1 = n*tact;
        return tact1;
        
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
