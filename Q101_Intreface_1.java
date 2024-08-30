// Q.101) Create a Shape Interface: Write a Java program to create an interface Shape with a method getArea(). Implement this interface in three classes: Rectangle, Circle, and Triangle. Provide the implementation for the getArea() method in each class.

public class Q101_Intreface_1 {
    public static void main(String [] args){

        // creating an object of class rectangle and calling method to get area
        Rectangle r1 = new Rectangle(10, 12);
        r1.getArea();

        // creating an object of class circle and calling method to get area
        Circle c1 = new Circle(16);
        c1.getArea();

        // create an object of class triangle and calling method to get area
        Triangle t1 = new Triangle(23, 19);
        t1.getArea();

    }    
}

interface Shape {
    // method to get area 
    public void getArea();
}

class Rectangle implements Shape {
    int b, l;

    public Rectangle(int b1, int l1){
        b = b1;
        l = l1;
    }

    // method to get area
    public void getArea(){
        System.out.println("Area of Rectangle : " + (b+l));
    }
}

class Circle implements Shape {
    int r;
    float pi;
    public Circle(int radius){
        r = radius;
        pi = 3.14F;
    }

    // method to get area
    public void getArea(){
        double area = 2*pi*r;
        System.out.println("Area of circle : " + area);
    }
}

class Triangle implements Shape {
    int b, h;
    float area;

    public Triangle(int b1, int h1){
        b = b1;
        h = h1;
    }

    public void getArea(){
        area = 1/2*b*h;
        System.out.println("Area of triangle : " + area);
    }
}


