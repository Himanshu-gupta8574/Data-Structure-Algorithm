public class practise_sum_recurstion {

    static int sumRecurstion(int n){
        if(n==1){
            return 1;
        }
        return n + sumRecurstion(n-1);
    }
    public static void main(String[] args) {
        int c = sumRecurstion(3);
        System.out.println(c);
    }
    
}
