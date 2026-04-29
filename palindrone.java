import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = input.nextInt();
        peledroneOfNumber(num);
        //System.out.println(rev);
    }
    public static void peledroneOfNumber(int num){
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}
