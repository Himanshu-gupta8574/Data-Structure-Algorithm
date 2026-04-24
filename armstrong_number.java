import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = input.nextInt();
        boolean armstrong = armstrongOfNumber(num);
        if(armstrongOfNumber){
        System.out.println("your number is armstrong");
        }
        else{
            System.out.println("your numbeeer is not armstrong");
        }
    }
    public static boolean armstrongOfNumber(int num){
        return false;
    }
    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }

}



