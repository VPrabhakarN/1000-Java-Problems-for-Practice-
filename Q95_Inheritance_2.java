// Q.95)  Implement single inheritance with a base class Vehicle and a derived class Car. Add a method startEngine() in the Vehicle class and override it in the Car class.

public class P95_Inheritance_2 {
    public static void main(String []args){
        // Creating an object of the child class
        Car maruti = new Car();

        // Calling method 
        maruti.start();
    }
}

class Vehicle {
    public Vehicle (){
        System.out.println("This is vehicle.");
    }

    // Start the engine method 
    public void start(){
        System.out.println("Vehicle's Engine is started...");
    }
}

class Car extends Vehicle {
    public Car(){
        super();
        System.out.println("This is car.");
    }

    // Override the method of the vehicle class
    @Override 
    public void start(){
        System.out.println("Car's Engine is started");
    }
}


