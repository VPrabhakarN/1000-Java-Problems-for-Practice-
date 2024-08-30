// Q.100)  Implement an example of constructor chaining in inheritance where a derived class constructor calls the base class constructor using super(). Use a base class Building and a derived class House

public class P100_Inheritance_7 {
    public static void main(String [] args){
        // creating an object of the derived class
        House h1 = new House();
    }
}

class Building  {
    public Building(){
        System.out.println("This is building!");
    }
}

class House extends Building {
    public House(){
        super();
        System.out.println("This is house too!");
    }
}
