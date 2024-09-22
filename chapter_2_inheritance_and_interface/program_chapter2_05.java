import java.util.*;
public class program_chapter2_05 {
    public static void main(String args[]){
        Animal b = new Cat(); //Animal reference but cat object
        b.move();
    }
}
//parent class
class Animal{
    public void move(){//method of animal class
        System.out.println("Animal can move...");
    }
}
//child class
class Cat extends Animal{
    public void move(){//method of cat class
        super.move(); //invokes the super class method
        System.out.println("Cats can walk and run");

    }
}


