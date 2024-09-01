// Q.115) Create an interface Runnable with a method run(). Implement this interface in a class SimpleRunner.

public class Q115_Interface_15 {
    public static void main(String[] args) {
        // creating an object of the class and calling the method 
        SimpleRunner sr = new SimpleRunner();
        sr.run();
    }
}

interface Runnable {
      void run();
}

class SimpleRunner implements Runnable {
    public void run(){
        System.out.println("Thread is running!");
    }
}