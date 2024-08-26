// Q.91) Write a class Calculator with methods to perform addition, subtraction, multiplication, and division.

class Calculator {
    int a, b;

    public Calculator(int num1, int num2){
        a = num1;
        b = num2;
    }

    // method to perform addition
    void addition(){
        System.out.println("Addition : " + (a+b));
    }

    // method to perform subtraction 
    void subtraction(){
        System.out.println("Subtraction : " + (a-b));
    }

    // method to perform multiplication
    void multiplication(){
        System.out.println("Multiplication : " + (a*b));
    }

    // method to perform  division 
    void division(){
        System.out.println("Division : " + (a/b));
    }
}

public class Q91_Class_and_Object_8 {
    public static void main(String []args){

        // creating an instance of the class
        Calculator c1 = new Calculator(19, 23);

        // performing addition 
        c1.addition();

        // performing subtraction 
        c1.subtraction();

        // performing muliplication
        c1.multiplication();

        // performing division
        c1.division();
    }
}
