import java.util.*;
public class program_nested_if_else_06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        if(age>18){
            System.out.print("You can do voting...");
            if(age>21){
                System.out.println("you can marry");
            }
        }
    }
}
