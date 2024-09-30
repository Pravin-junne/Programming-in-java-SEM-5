
interface conversions{
    double GM_TO_KG = 1000;
    double gmtokg(double gm);
    double kgtogm(double kg);
}

class convert implements conversions{
    public double gmtokg(double gm)
    {
        return gm/GM_TO_KG;
    }

    public double kgtogm(double kg){
        return kg*GM_TO_KG;
    }
}

public class program_chapter2_16 {
    public static void main(String args[]){
        convert convobj = new convert();
        conversions c;
        c = convobj;
        System.out.println("2000 gm= "+c.gmtokg(2000)+" kg");
        System.out.println("50kg = "+ c.kgtogm(50)+" gm");
    }
}
