import java.util.*;
public class program_method_04 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Main.evenOdd(num);
        sc.close();
    }
}

class Main{
    //method to check wheter the number odd or even
    public static void evenOdd(int num){
        if(num%2 == 0){
            System.out.print("is even: "+num);
        }
        else{
            System.out.print("is odd: "+num);
        }
    }
}
