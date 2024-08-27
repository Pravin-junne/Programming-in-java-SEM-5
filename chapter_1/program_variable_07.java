//instance variable

public class program_variable_07{


    public static void main(String args[]){
        Car car1 = new Car("Tesla",2020,true);
        Car car2 = new Car("Toyota", 2024, false);

        car1.displayInfo();
        car2.displayInfo();
    }

}
//Car class
class Car{
    //instance variable
    String name;
    int model;
    boolean isElectric;
    //paramitrized constractor
    Car(String name, int model, boolean isElectric){
        this.name = name;
        this.model = model;
        this.isElectric = isElectric;
    }
    //display method
    public void displayInfo(){
        System.out.println("Car name:"+name);
        System.out.println("Model :"+model);
        System.out.println("is Electric:"+isElectric);
        System.out.println();
    }
}