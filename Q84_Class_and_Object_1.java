// Q.84) Create a class Car with attributes like model, year, and color. Instantiate an object and display the details.

class Car {
    String model;
    int year;
    String color;

    public Car(String m, int y, String c){
        model = m;
        year = y;
        color = c;
    }

    // method to display the details 
    public void show(){
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Color : " + color);
    }
}

public class Q84_Class_and_Object_1{
    public static void main(String [] args){
        
        // creating an object of a  class 
        Car m1 = new Car("Maruti Suzuki", 2019, "Yellow");
        m1.show();
    }
}
