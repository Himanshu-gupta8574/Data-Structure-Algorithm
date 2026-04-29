import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }
    public static int passwordd(int num){
        int num;
        do{
            System.out.println("enter your password");
             num = input.nextInt();
        }
        while(password == num);
            System.out.println("entered password is correct 'welcome" +num);
    }
}
