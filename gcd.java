import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("enter the second number : ");
        int num2 = input.nextInt();
        int gcd = greatestCommonDivision(num1,num2);
        System.out.println(gcd);
    }
        public static int greatestCommonDivision(int num1,int num2){
            int GcD = 1;
                int least = least(num1, num2);   // OR (MAX) ALSO U CAN USE
                for(int i=2;i<=least;i++){
                   if(num1%i ==0 && num2%i == 0){
                   GcD = i;
                }
            }
            return GcD;
        }
        public static int least(int num1,int num2){
            if(num1<num2){
                return num1;
            }
            else{
                return num2;
            }
 
        }

    }
