// Q.112) Create an interface Animal with a method sound(). Implement this interface in classes Dog and Cat.

public class Q112_Interface_12 {
    public static void main(String[] args) {
        // creating an object of the dog class and calling the method
         Dog d1 = new Dog();
         d1.sound();

         // creating an object of the cat class and calling the method
         Cat c1 = new Cat();
         c1.sound();

    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {
    public Dog(){
        System.out.println("This is dog!");   
    }

    public void sound(){
        System.out.println("Dog says Bhow bhow bhow");
    }
}

class Cat implements Animal {
    public Cat(){
        System.out.println("This is cat!");   
    }

    public void sound(){
        System.out.println("Cat says Meow Meow Meow");
    }
}