// Q.98) Implement a Java program that uses hierarchical inheritance. Create a base class Shape and two derived classes Circle and Rectangle. Add a method draw() in the base class and override it in both derived classes.

public class Q98_Inheritance_5 {
    public static void main(String [] args){
        // creating an object of child 1 
        Circle c1 = new Circle();

        // caliing method 
        c1.draw();

        // creating an object of child 2
        Rectangle r1 = new Rectangle();

        // calling method 
        r1.draw();
    }
}

class Shape {

    // method to draw shape 
    public void draw(){
        System.out.println("I'm drawing a shape!");
    }
}

class Circle extends Shape {

    // override the method 
    @Override 
    public void draw(){
        System.out.println("I'm drawing a circle!");
    }
}

class Rectangle extends Shape {
    
    // override the method
    @Override 
    public void draw(){
        System.out.println("I'm drawing a rectangle!");
    }
}
