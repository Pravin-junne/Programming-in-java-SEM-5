public class program_chapter2_06 {
    public static void main(String args[]){
        Secondary s = new Secondary(10, 20);
        s.show();
        s.display();
    }
}

class Primary{
    int cal;        //declaration1
    Primary(int a)
    {
        cal = a;
    }

    void show()
    {
        System.out.println("Super class cal: "+cal);
    }
}

class Secondary extends Primary{
    int cal;    //declaration2
    Secondary(int x, int y)     //statement1
    {
        super(y); //pass the value to super class constractor
        cal = x;
    }

    void display()
    {
        System.out.println("Sub class cal : "+cal);
    }
}
