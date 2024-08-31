// Q.108) Define an interface Shape with a method draw(). Create another interface ColoredShape that extends Shape and adds a method color(). Implement ColoredShape in a class ColoredCircle.

public class Q108_Interface_8 {
    public static void main(String[] args) {
        // creating an object and calling method
        ColoredCircle cc = new ColoredCircle();
        cc.draw();
        cc.color();

    }
}

interface Shape {
    public void draw();
}

interface ColoredShape extends Shape {
    public void color();
}

class ColoredCircle {
    public ColoredCircle(){
        System.out.println("******* Circle Details ******");
    }
    public void draw(){
        System.out.println("Drawing a circle!");
    }

    public void color(){
        System.out.println("Circle is coloured with red colour!");
    }
} 
