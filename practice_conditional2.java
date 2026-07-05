import java.util.Scanner;
public class practice_conditional2 {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("the marks in chemistry subject");
        m1 = sc.nextInt();
        
        System.out.println("the marks in chemistry subject");
        m2 = sc.nextInt();

        System.out.println("the marks in chemistry subject");
        m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println(avg);

        if(m1>33 && m2>33 && m3>33 && avg>=40){
            System.out.println("the student the passed sussesfully");
        }

        else{
            System.out.println("the student is fail,,,");
        }


    }
    
}
