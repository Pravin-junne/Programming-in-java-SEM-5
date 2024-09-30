public class program_chapter2_07 {
    public static void main(String args[]){
        //object of subclasss
        Subclass obj1 = new Subclass(10, 2);
        //display method call
        obj1.display();
    }
}

class SuperClass{
    int n;
}

class Subclass extends SuperClass{
    int n;  //This hides n of superclass

    Subclass(int x, int y)
    {
        if(x>y)
        {
            super.n = x;
            n=y;
        }
        else
        {
            super.n=y;
            n=x;
        }
    }

    void display(){
        System.out.println("n is Superclass="+super.n);
        System.out.println("n is subclass="+n);
    }
}