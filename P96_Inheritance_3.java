// Q.96) Write a Java program to demonstrate the use of the super keyword to call the parent class constructor from the child class.
public class P96_Inheritance_3 {
    public static void main(String [] args){
        // creting an object of child class
        Vijay v1 = new Vijay();
        v1.marks();
    }
}


class Student {
    public Student(){
        System.out.println("He is the smart student!");
    }
}

class Vijay extends Student {
    public Vijay(){
        super();
        System.out.println("Vijay is the smart student!");
    }

    public void marks(){
        System.out.println("He has scored 90.60%");
    }
}

