import java.util.Scanner;
public class practise_conditional_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income in lakhs");
        float tax = 0;
        float income = sc.nextFloat();

        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + .05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10f){
            tax = tax + .05f * (5f - 2.5f);
            tax = tax + .2f * (income - 5f);
        }
            else if(income>10f){
                tax = tax + 0.05f * (5f - 2.5f);
                tax = tax + 0.2f * (income - 5f);
                tax = tax + 0.3f * (income - 10.f);
            }
            System.out.println("the total tax paid by the employee : " + tax);
        }
        }


