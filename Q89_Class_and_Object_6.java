// Q.89) Design a Rectangle class with methods to calculate the area and perimeter.

class Rectangle {
    int length, breadth, perimeter;
    float area;

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    // method to calculate and display the area
    void area(){
        area = length * breadth;
        System.out.println("Area : " + area);
    }

    // method to calculate and display the perimeter
    void perimeter(){
        perimeter = length + breadth;
        System.out.println("Perimeter : " + perimeter);
    }
}


public class Q89_Class_and_Object_6 {
    public static void main(String [] args){

        // creating an instance of the class
        Rectangle r1 = new Rectangle(10, 20);

        // methods to displaying the area and peimeter
        r1.area();
        r1.perimeter();
    }
}
