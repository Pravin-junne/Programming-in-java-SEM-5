
class employee{
    String ename;
    void get_ename(String name)
    {
        ename = name;
    }

    void print_enmae()
    {
        System.out.println("Name = "+ename);
    }
}

class gross_sal extends employee{
    float basic, da, hra, gsal;
    void calc_gross_sal(int b, int dapercent, int hrpercent)
    {
        basic = b; //calculate DA and HRA
        da = basic * dapercent/100;
        hra = basic* hrpercent/100;
        gsal = basic + da + hra;
    }

    void print_gross_sal()
    {
        System.out.println("Gross sal = "+ gsal);
    }
}

interface taxes
{
    float ptax = 200f;
    float itaxpercent = 20f;
    float calc_taxes();
}

class salary extends gross_sal implements taxes{
    public float calc_taxes()
    {
        return ptax + (gsal * itaxpercent);
    }

    void display()
    {
        float tax = calc_taxes();
        float nsal = gsal;
        print_enmae();
        print_gross_sal();
        System.out.println("taxes: "+tax);
        System.out.println("Net Sal: "+ nsal);
    }
}

public class program_chapter2_19 {
    public static void main(String args[]){
        salary empsal = new salary();
        empsal.get_ename("Pravin");
        empsal.calc_gross_sal(90000, 50, 20);
        empsal.display();
    }    
}
