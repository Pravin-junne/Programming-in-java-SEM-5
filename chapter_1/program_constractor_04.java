public class program_constractor_04 {
public static void main(String args[]){
    Main obj1 = new Main("Pravin", 4212,20);
    Main obj2 = new Main("Pandurang",4213);

    obj1.display();
    obj2.display();
}
}

class Main{
    int rollNo;
    String name;
    int age;

    Main(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    Main(String name, int rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;  
    }

    void display(){
        System.out.print("Name: "+name+"\n"+"Roll No: "+rollNo+"Age: "+age);
    }
}
