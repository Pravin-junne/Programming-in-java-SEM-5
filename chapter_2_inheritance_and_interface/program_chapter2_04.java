//hierarchical inheritance
public class program_chapter2_04 {
    public static void main(String args[]){
        C obj1 = new C();
        obj1.m1();

        B obj2 = new B();
        obj2.m1();
    }    
}
//super class //parent class
class A{
    void m1(){
        System.out.println("Method in class A");
    }
}
//base class //child class
class B extends A{

}
//base class //child class
class C extends A{

}
