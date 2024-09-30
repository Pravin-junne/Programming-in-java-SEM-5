//package chapter_3;
import java.util.*;
public class Program_java_02 {
  //ArrayList
  public static void main(String args[]){

    ArrayList<String> nameList = new ArrayList<>(); //store only String type of elements
    //adding elements
    nameList.add("Pravin");
    nameList.add("Pandurang");
    nameList.add("Tushar");
    nameList.add(1,"Pranav");
    
    //print list
    System.out.println(nameList);
  }  
}
