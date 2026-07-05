import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        System.out.println("here is the fibbonachi series : ");
        fibonachiOfNumber(num);
    }
    public static void fibonachiOfNumber(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int first = 0;
        int second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
