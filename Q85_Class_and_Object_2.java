// Q.85) Design a class Circle with methods to calculate the area and circumference.

class Circle {
    double pi;

    public Circle(){
        pi = 3.14159;
    }

    // method to calculate and return the area of the circle 
    public double area(int r){
        double area = pi * (r*r);
        return area;
    }

    // method to calulate and return the circumference of the circle
    public double circumference(int r){
        double cir = 2 * pi * r;
        return cir;
    }
}

public class Q85_Class_and_Object_2 {
    public static void main(String [] args){

        // creting an object of an class 
        Circle c1 = new Circle();

        // displaying the area
        System.out.println("Area : "+c1.area(19));

        // displaying the circumference 
        System.out.println("Circumference : " + c1.circumference(23));
    }
}
