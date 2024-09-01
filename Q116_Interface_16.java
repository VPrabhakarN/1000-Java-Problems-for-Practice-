// Q.116) Define an interface Drivable with a method drive(). Implement this interface in a class Car

public class Q116_Interface_16 {
    public static void main(String[] args) {
        // creating an object of the class and calling the method 
        Car c1 = new Car();
        c1.drive();
    }
}

interface Drivable {
     abstract void drive();
}

class Car implements Drivable {
    public Car(){
        System.out.println("This is car!");
    }

   public void drive(){
    System.out.println("Start to drive the car!");
    }
}
