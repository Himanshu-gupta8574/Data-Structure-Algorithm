import java.util.Scanner;
public class practise_conditional_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the yeear : ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("the year is not leap year");
        }
    }
    
}
