//package chapter_3;
import java.util.*;
public class Program_java_08 {
    public static void main(String args[]){
        //linkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("Vrashali");
        list.addFirst("Pravin");

        Iterator<String> e = list.iterator(); //iterator

        while(e.hasNext())
        {
            System.out.println(e.next());//next() method
        }
    }
}
