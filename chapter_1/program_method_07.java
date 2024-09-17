public class program_method_07 {
    public static void main(String args[]){
        Main obj1 = new Main();
        System.out.println(obj1.sub(10, 5));
    }
    
}

class Main{
    int sub(int a, int b){
        return a-b;
    }
}
