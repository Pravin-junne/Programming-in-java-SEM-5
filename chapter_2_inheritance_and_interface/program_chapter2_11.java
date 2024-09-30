public class program_chapter2_11 {
    public static void main(String args[]){
        int x = 10;
        final int y = 20;
        
        System.out.println("X is :"+x);
        System.out.println("Y is :"+y);

        x=30;
        y = 40; //it gives error because we can not assign value to final variable y

        System.out.println("X is :"+x);
        System.out.println("Y is :"+y);
    }
}
