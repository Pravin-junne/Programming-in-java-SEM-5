
abstract class Shape{//abstract class 
    double pi = 3.14;
    abstract void area();   //abstract method

    void display()
    {
        System.out.println("\n Non-abstract method of class Shape");
    }
}

class rectangle extends Shape{
    int l,b;
    rectangle(int x, int y)
    {
        l = x;
        b = y;
    }

    void area(){//Implementing abstract method
        System.out.println("\n Area of Rectangle");
        System.out.println("Length= "+l);
        System.out.println("Breadth= "+b);
        System.out.println("Area= "+(l*b));
    }
    
}



public class program_chapter2_14 {
    public static void main(String args[]){
        Shape s;
        rectangle r = new rectangle(10, 10);
        s=r;    //Shape reference rectangle
        s.area();
    }    
}
