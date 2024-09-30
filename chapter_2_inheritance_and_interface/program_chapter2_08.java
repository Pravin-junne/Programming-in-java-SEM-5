import javax.print.DocFlavor.READER;

public class program_chapter2_08 {
    public static void main(String args[]){
        HDFC s = new HDFC();

        ICICI i = new ICICI();

        SBI a = new SBI();

        System.out.println("HDFC Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("SBI Rate of Interest: "+a.getRateOfInterest());
    }
    
}
//super class
class Bank{
    int getRateOfInterest()
    {
        return 0;
    }
}
//sub class
class HDFC extends Bank{
    int getRateOfInterest()
    {
        return 8;
    }
}
//sub class
class ICICI extends Bank{
    int getRateOfInterest()
    {
        return 7;
    }
}
//sub class
class SBI extends Bank{
    int getRateOfInterest()
    {
            return 9;
    }
}