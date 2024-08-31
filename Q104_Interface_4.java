// Q.104) Create an interface SmartDevice with a default method connectToWifi() and an abstract method turnOn(). Implement this interface in a SmartTV class.
interface SmartDevice {
    public void turnOn();

    default public void connectToWifi(){
        System.out.println("Wifi is connected successfully!");
    }
}

class SmartTV implements SmartDevice {
     public SmartTV(){
        System.out.println("This is a smart television!");
    }

    public void turnOn(){
        System.out.println("Turning on the televison.....");
    }
}


public class Q104_Interface_4 {
    public static void main(String []args){
        // creating an object and calling method
        SmartTV st1 = new SmartTV();
        st1.turnOn();
        st1.connectToWifi();
    }
}

