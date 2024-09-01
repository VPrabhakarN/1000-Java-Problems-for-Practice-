// Q.113) Create an interface Printer with a default method print(String message). Implement this interface in a class SimplePrinter.

public class Q113_Interface_13 {
    public static void main(String[] args) {
        // creating an object of the class and call the methods 
        SimplePrinter sp = new SimplePrinter();
        sp.print("Start the Printing!!!!");
    }
}

interface Printer {
    void print(String message);
}

class SimplePrinter implements Printer {

    // method to print the message 
    public void print(String message){
        System.out.println(message);
    }
}