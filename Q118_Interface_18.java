// Create an interface Device with methods turnOn() and turnOff(). Implement this interface in a class TV.

public class Q118_Interface_18 {
    public static void main(String[] args) {
     // creating an object of the class and calling the methods
     TV t = new TV();
     t.turnOn();
     t.turnOff();   
    }
    
}

interface Device {
    abstract void turnOn();
    abstract void turnOff();
}

class TV implements Device {
    public TV(){
        System.out.println("This is TV!");
    }

    public void turnOn(){
        System.out.println("Turning On the televesion");
    }

    public void turnOff(){
        System.out.println("Turning Off the televesion");
    }
}