// Define an interface Animal with methods sound() and move(). Create classes Dog and Fish that implement this interface.

public class Q103_Interface_3 {
    public static void main(String [] args){

        // creating an object of Dog class and calling methods
        Dog d1 = new Dog();
        d1.sound();
        d1.move();

        // creating an object of Fish class and calling methods 
        Fish f1 = new Fish();
        f1.sound();
        f1.move(); 
    }
}

interface Animal {
    public void sound();
    public void move();
}

class Dog implements Animal {
    public Dog(){
        System.out.println("This is a dog!");
    }
    // method for sound
    public void sound(){
        System.out.println("Dogs are barking!");
    }

    // method for move
    public void move(){
        System.out.println("Dogs are moving from left to right");
    }
}

class Fish implements Animal {
    public Fish(){
        System.out.println("This is a fish!");
    }

    // method for sound
    public void sound(){
        System.out.println("Fishes are so quite!");
    }

    // method for move
    public void move(){
        System.out.println("Fishes are moving from left to right!");
    }
}


