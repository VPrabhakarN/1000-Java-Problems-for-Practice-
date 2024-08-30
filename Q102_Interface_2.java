// Create an interface Vehicle with a method start(). Implement this interface in classes Car and Bike.

public class Q102_Interface_2 {
    public static void main(String []args){
        // creating an object of Car class and calling method to start the car
        Car c1 = new Car();
        c1.Start();

        // creating an object of Bike class and calling method to start the bike
        Bike b1 = new Bike();
        b1.Start();

    }
}

interface Vehicle {
    public void Start();
}

class Car implements Vehicle {
    // method to start the car
    public void Start(){
        System.out.println("Car is started.....");
    }
}

class Bike implements Vehicle {
    public void Start(){
        System.out.println("Bike is started.....");
    }
}
