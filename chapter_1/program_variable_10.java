import java.util.*;
public class program_variable_10 {
    
    public static void main(String args[]){
        double a,b,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        a = sc.nextDouble();
        System.out.println("Enter the second number:-");
        b = sc.nextDouble();

        char operator;
        System.out.println("Enter the operator:-");
        operator = sc.next().charAt(0); //to store char value
        //switch case to do calculation
        switch (operator) {
            case '+':
                ans = a+b;
                System.out.println("Answer:-"+ans);
                break;

            case '-':
                ans = a-b;
                System.out.println("Answer:-"+ans);
                break;

            case '*':
                ans = a*b;
                System.out.println("Answer:-"+ans);
                break;

            case '/':
                ans = a/b;
                System.out.println("Answer:-"+ans);
                break;
        
            default:
                System.out.println("Sorry wrong operator");
                break;
        }
    }
}
