import java.util.Scanner;
public class practise_conditional_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your website");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("this is organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("this is commercial  website");
    }
    else if(website.endsWith(".in")){
        System.out.println("this is Indian  website");
    
}
        else{
            System.out.println("this not website");
        }
    }
}
