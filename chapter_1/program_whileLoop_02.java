import java.util.*;
public class program_whileLoop_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int total = 0;

        System.out.print("Enter the number:");
        number = sc.nextInt();

        while(number >= 0){
          // sum = sum + number;
          total += number;
            System.out.print("Enter the number:");
            number = sc.nextInt();
        }

        System.out.print("Positive number sum is:"+total);
    }
}
