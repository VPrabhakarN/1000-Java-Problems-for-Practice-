// Q.99) Create a base class Appliance with a method turnOn(). Derive a class WashingMachine that overrides the turnOn() method. Demonstrate the use of the super keyword to call the base class method.


public class Q99_Inheritance_6 {
    public static void main(String [] args){
        // creating an object of the derived class
        WashingMachine w1 = new WashingMachine();

        // calling method to turning on the machine
        w1.turnOn();
    }
}

class Appliance {
    public Appliance(){
        System.out.println("This base class's constructor is automatically called by using super() method");
    }

    // method to turn on 
    public void turnOn(){
        System.out.println("This is turning on!");
    }
}

class WashingMachine extends Appliance {
    public WashingMachine(){
        super();
        System.out.println("This is washing machine! and this derived class's constructor is automatically called while object is created!");
    }

    // override the method 
    @Override 
    public void turnOn() {
        System.out.println("Turning on washing machine........");
    }
}
