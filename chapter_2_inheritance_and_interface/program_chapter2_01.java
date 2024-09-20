    //parent class
class Super{
    int i,j;
    void show()
    {
        System.out.print("i and j: ");
        System.out.println(+i+" "+j);
    }
}
    //child class
class Sub extends Super{
    int k;
    void display()
    {
        System.out.println("k: "+k);
    }

    void sum()
    {
        System.out.println("i+j+k: "+(i+j+k));
    }
}

public class program_chapter2_01 {
    public static void main(String args[]){
        Super a = new Super();
        Sub b = new Sub();

        a.i = 5;
        a.j = 10;
        System.out.println("Contents of super: ");
        a.show();
        System.out.println();

        b.i = 11;
        b.j = 13;
        b.k = 17;
        System.out.println("contents of sub: ");
        b.show();
        b.display();
        System.out.println();
        System.out.println("Sum of i, j, and k in sub:");
        b.sum();
    }
}