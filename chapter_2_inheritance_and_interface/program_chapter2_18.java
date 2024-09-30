
interface emp_info{
    int empid = 10;
    String empname = "Pravin";
    String empaddr = "Pune";
    void disp1();
}

interface emp_show extends emp_info{
    void disp2();
}

class emp implements emp_show{
    public void disp()
    {
        System.out.println("\n Inside Display function...");
    }

    public void disp1()
    {
        disp();
        System.out.println("Empid = "+ empname);
        System.out.println("Address = "+empaddr);
    }
    public void disp2()
    {
        disp();
        System.out.println("Name: "+empname);
        System.out.println("Address: "+empaddr);
    }
}

public class program_chapter2_18 {
    public static void main(String args[]){
        emp e = new emp();
        System.out.println("From method disp1");
        e.disp1();

        System.out.println();

        System.out.println("From Method disp2");
        e.disp2();
    }
}
