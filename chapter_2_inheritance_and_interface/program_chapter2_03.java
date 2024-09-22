public class program_chapter2_03 {
    public static void main(String args[]){
        C obj1 = new C();
        obj1.m1();
        obj1.m2();
        obj1.m3();
    }    
}
//super class/ parent clall
class A{
    void m1(){
        System.out.println("method in class A");
    }
}
//base class/ child class
class B extends A{
    void m2(){
        System.out.println("method in class B");
    }
}

//child class of B class
class C extends B{
    void m3(){
        System.out.println("method in class C");
    }
}
