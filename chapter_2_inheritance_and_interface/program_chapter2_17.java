
interface conversions{
    double GM_TO_KG = 1000;
    double gmtokg(double gm);
    double kgtogm(double kg);
}

abstract class convert implements conversions{
    public double gmtokg(double gm)
    {
        return gm / GM_TO_KG;
    }


}

class convert_sub extends convert implements conversions{
    public double kgtogm(double kg)
    {
        return kg*GM_TO_KG;
    }
}

public class program_chapter2_17 {
    public static void main(String args[]){
        convert_sub convObj = new convert_sub();
        conversions c;
        c = convObj;
        System.out.println("2000 gm = "+c.gmtokg(2000)+" kg");
        System.out.println("50 kg = "+c.kgtogm(50)+ " gm");
    }    
}
