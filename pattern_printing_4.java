import java.util.Scanner;
public class pattern_printing_4 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();

        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
           }
            for(int k=1;k<=i;k++){
                        System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
