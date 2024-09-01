// Q.111) Define an interface Multiplier with a method multiply(int a, int b). Implement this interface in a class SimpleMultiplier.

public class Q111_Interface_11 {
    public static void main(String[] args) {
        // creating an object of the class and calling the methods 
        SimpleMultiplier sc = new SimpleMultiplier();
        sc.multiply(19, 23);
    }
}

interface Multiplier {
    void multiply(int a, int b);
} 

class SimpleMultiplier implements Multiplier {

        public SimpleMultiplier(){
        System.out.println("****** Multiplication ******");
    }

    public void multiply(int a, int b){
        System.out.println("Multiplication : " + (a*b));
    }
} 