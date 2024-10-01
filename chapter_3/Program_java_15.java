//Deque
import java.util.*;

public class Program_java_15 {
    public static void main(String args[]){
        //Deque
        Deque<String> dList = new ArrayDeque<>();
        //adding elements in dList
        dList.offer("Vaibhav");
        dList.offer("Hardik");
        dList.offerFirst("Pravin");//add element at first
        dList.offerLast("Pandurang");//add element at last

        System.out.println("Elements in deque:");
        for(String st : dList){
            System.out.println(st);
        }

        System.out.println("First peek element: "+dList.peekFirst());

        System.out.println("Last peek element: "+dList.peekLast());
    }    
}
