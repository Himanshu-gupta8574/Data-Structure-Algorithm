import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] arr = {3,4,6,7,8};
       System.out.println("enter the number you want to search");
       int num = input.nextInt();
       boolean isFound = isFound(arr, num);
       if (isFound){
        System.out.println("your number is found in array");
       }
       else{
        System.out.println("your number is not found in arr");
       }
    }
    public static boolean isFound (int[] arr, int num){
        for(int i=0;i<=arr.length;i++){
            if(arr[arr.length] == num){
                return true;
            }
        }
        return false;
    }
}
