public class program_chapter2_12 {
    public static void main(String args[]){
        Temp t = new Temp();
        t.disp();
    }
}

class FM{
    final void disp()
    {
        System.out.println("\nInside FM class....");
    
    }
}

class Temp extends FM{
    void disp()//we can not ovveride final method
    {
        System.out.println("\nInside Temp class...");
    }
}