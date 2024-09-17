public class program_method_02 {
    public static void main(String args[]){
        int num=10;
        System.out.println(Main.squar(num));//static method call by class name 
    }
    
}
class Main{
    //claculate squar
    static int  squar(int num){
        return num*num;
    }
}
