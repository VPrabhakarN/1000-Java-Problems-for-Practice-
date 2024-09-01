// Q.119) Define an interface Clickable with a method click(). Implement this interface in a class Button.

public class Q119_Interface_19 {
    public static void main(String[] args) {
        // creating an object and calling method
        Button b1 = new Button();
        b1.click();
    }
}

interface Clickable {
    abstract void click();
}

class Button implements Clickable {
    public Button(){
        System.out.println("This is button!");
    }


    // click method
    public void click(){
        System.out.println("Button is clicked!");
    }
}