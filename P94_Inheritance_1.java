 // Q.94) Create a base class Animal with a method sound() and create two derived classes Dog and Cat. Override the sound() method in both derived classes.

 class Animal {
	public Animal(String name) {
		System.out.println("Name of the animal is : " + name);
	}

	// method for sound
	public void Sound() {
		System.out.println("Cat says meow...meow");
	}
}

 class Dog extends Animal{

	public Dog(String name) {
		super(name);
		System.out.println("Name of the dog is : " + name);
	}
	
	@Override 
	public void Sound() {
		System.out.println("Dog is barking...!");
	}
}


public class P94_Inheritance_1 {
	public static void main(String[] args) {
		
		// Creating object of child class
		Dog d1 = new Dog("simbah");
		
		// Caling method of 
		d1.Sound();
		
		// Creating an object of the parent class
		Animal a1 = new Animal("Minnu");
		
		// calling method of sound
		a1.Sound();
		

	}

}
