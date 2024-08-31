// Q.109) Create an interface Calculator with a static method add(int a, int b) that returns the sum. Use this method in a class MathOperations.

public class Q109_Interface_9 {
    public static void main(String[] args) {
        // creating an object of the class and calling method
        MathOperations mo = new MathOperations(19, 23);
        mo.result();
         
        
    }
}

interface Calculator {
     public static int add(int a, int b)
    {
        return a+b;
    }
}

class MathOperations implements Calculator {
    int num1, num2;
     MathOperations(int a, int b){
        num1 = a;
        num2 = b;
        System.out.println("*********** Math Operations *************");
    }

    public void result(){
        System.out.println("Sum : " + Calculator.add(num1, num2));
    }
}
