// Q.97) Create a base class Person with properties name and age. Derive a class Student from Person that adds a property studentId. Write a constructor for Student that initializes all properties.

public class P97_Inheritance_4 {
    public static void main(String [] args){
        // creating an object of the child class
         Student st1 = new Student("Vijay", 21, 112213);

         // calling methods to display student's details
         st1.Age();
         st1.Name();
         st1.Id();
    }
}

class Person {
    String name;
    int age;
    public Person(String n, int a){
        name = n;
        age = a;
    }

    public void Name(){
        System.out.println("Name : " + name);
    }

    public void Age(){
        System.out.println("Age : " + age);
    }
}

class Student extends Person {
    String name;
    int age;
    int id;
    public Student(String n, int a, int i){
        super(n, a);
        id = i;
    }

    public void Id(){
        System.out.println("Id : " + id);
    }
}
