// Q.114) Define an interface Constants with a constant PI. Implement this interface in a class Circle to calculate the area.

public class Q114_Interface_14 {
    public static void main(String[] args) {
        // creating an object of the circle class and calling the methods
        Circle c = new Circle(19);
        c.Area();
    }
}

interface Constants {
    public final float PI = 3.14F;
}

class Circle implements Constants {
    int radius;
    double area;
    public Circle(int r){
        radius = r;
        System.out.println("Calculating the area.......");
    }

    public void Area(){
        area = 2*PI*radius;
        System.out.println("Area : " + area);
    }
}