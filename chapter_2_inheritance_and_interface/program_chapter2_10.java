public class program_chapter2_10 {
    public static void main(String args[]){
        Mexican_Dish md;
        md = new Guacamole();
        md.disp();

        md = new Tacos();
        md.disp();

        md = new Mexican_Pizza();
        md.disp();


    }
}

class Mexican_Dish{
    void disp()
    {
        System.out.println("\nInside Mexican Dish class....");
    }
}

class Guacamole extends Mexican_Dish{
    void disp()
    {
        System.out.println("\nWELCOME TO MEXICAN DISHES.... ");
        System.out.println("\nInside Guacamole Dish class....");
    }
}

class Tacos extends Mexican_Dish{
    void disp()
    {
        System.out.println("\nInside Tacos Dish class....");
    }
}

class Mexican_Pizza extends Mexican_Dish{
    void disp()
    {
        System.out.println("\nInside Mexican_pizza Dish class....");
    }
}