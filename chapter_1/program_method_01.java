public class program_method_01 {
    //user define mehtod for addition of two numbers
    int addition(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        program_method_01 obj1 = new program_method_01();

        System.out.println(obj1.addition(10, 20));
    }
}
