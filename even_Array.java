public class even_Array {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        int ans = findNumbers(num);
        System.out.println(ans);
        System.out.println(digits(4563));
    }
    public static int findNumbers(int[] num){
        int count = 0;
        for(int nums : num){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 ==  0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
