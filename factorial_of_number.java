import java.util.Scanner;

public class factorial_of_number {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = input.nextInt();
        long fact = factorail(num);
        System.out.println("factorial is : " + fact);
    }
    public static long factorail(int num){
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}
