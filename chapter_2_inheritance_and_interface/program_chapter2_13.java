
final class Demo1{
    public void display()
    {
        System.out.println("hi");
    }
}
public class program_chapter2_13 extends Demo1 {//gives error cannot inherit form final demo1
    public static void main(String args[]){
        Demo1  d = new Demo1();
        d.display();
    }
}
