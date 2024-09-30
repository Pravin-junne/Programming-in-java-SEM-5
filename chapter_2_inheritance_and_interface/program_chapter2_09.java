
public class program_chapter2_09 {
    public static void main(String args[]){
        Bike b = new Platina(); //upcasting

        b.run();
    }    
}

class Bike{
    void run()
    {
        System.out.println("running...");
    }
}

class Platina extends Bike{
    void run()
    {
        System.out.println("Running safely with 80km");
    }
}