
interface ShowableExe{
    void show();
    interface Message{
        void msg();
    }
}

class TestNestedInterface1 implements ShowableExe.Message{
    public void msg()
    {
        System.out.println("program for nested Interface...");
    }
     
}

public class program_chapter2_20 {
    public static void main(String args[]){
        ShowableExe.Message message = new TestNestedInterface1();
        message.msg();
    }
}
