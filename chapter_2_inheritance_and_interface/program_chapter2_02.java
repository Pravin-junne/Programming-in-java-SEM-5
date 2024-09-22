//single level inheritance
import java.util.*;
public class program_chapter2_02{
    public static void main(String args[]){
        Second s1;
        s1 = new Second();

        s1.first();
        s1.second();
     
    }
    

}

//parent class/super class
class First{
    
  
    void first(){
        System.out.println("i am in class first...");
    }
}

//child class/ base class
class Second extends First{
 
    void second(){
        System.out.println("i am in class second...");
    }

}