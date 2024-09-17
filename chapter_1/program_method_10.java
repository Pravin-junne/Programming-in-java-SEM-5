public class program_method_10 {
    public static void main(String args[]){
        Main obj1 = new Main();
        System.out.print(obj1.mod(10, 2));
    }
}

class Main{
    //modulo
    int mod(int a, int b){
        return a%b;
    }
}