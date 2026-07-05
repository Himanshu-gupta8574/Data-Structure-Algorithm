import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("enter the second number : ");
        int num2 = input.nextInt();
        int lsm = leastCommonFactor(num1,num2);
        System.out.println(lsm);
    }
    public static int leastCommonFactor(int num1,int num2){
        for(int i=1;i<=num2;i++){
        int factor = num1*i;
        if(factor%num2 == 0 ){
            return factor;
        }
    }
        return 0;
    }
    
}
