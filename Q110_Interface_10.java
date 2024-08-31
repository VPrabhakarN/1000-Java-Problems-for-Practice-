// Q.110) Create an interface Calculator with a method add(int a, int b). Implement this interface in a class SimpleCalculator

public class Q110_Interface_10 {
    public static void main(String []args){
        // creating an object of the class and calling the method
        SimpleCalculator sc = new SimpleCalculator();
        sc.add(19, 23);
    }
}

interface Calculator {
    void add(int a, int b);
}

class SimpleCalculator implements Calculator {
    public  SimpleCalculator(){
        System.out.println("******* Addition *******");
    }

 
    public void add(int a, int b){
        System.out.println("Addition : " + (a+b));
    }
}
