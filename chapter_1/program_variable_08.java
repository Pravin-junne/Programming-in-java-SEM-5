//static variable
public class program_variable_08 {
    public static void main(String args[]){
        //objects of counter class
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        //calling display static method
        Counter.displayCount();
    }
}

//class counter
class Counter{
    static int count;

    public Counter(){
        count++;
    }

    public static void displayCount(){
        System.out.println("Number of instances created:-"+count);
    }
}