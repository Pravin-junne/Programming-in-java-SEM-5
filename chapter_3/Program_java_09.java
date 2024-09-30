//package chapter_3;
import java.util.*;
public class Program_java_09 {
    public static void main(String args[]){
        LinkedList list = new LinkedList<>();
        
        list.add("Pravin");
        list.add("pandurang");
        list.add("Umesh");
        list.add("pranav");
        list.add("Tushar");

        System.out.println(list);

        list.remove("Umesh"); //remove umesh from list
        System.out.println(list);

        list.removeLast();  //remove last value from list
        System.out.println(list);
    }
}
