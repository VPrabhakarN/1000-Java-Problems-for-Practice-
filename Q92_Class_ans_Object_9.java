// Q.92) Implement a Person class with attributes name and age. Add a method to display a birthday message.

class Person{
    String name;
    int age;

    public Person(String n, int a){
        name = n;
        age = a;
    }

    // method to display a birthday message
    void birthday(){
        System.out.println("Happy Birthday "+name);
    }
}

public class Q92_Class_ans_Object_9 {
    public static void main(String [] args){
        
        // creating an instance of the class
        Person p1 = new Person("Vijay", 21);

        // method to display birthday message
        p1.birthday();
    }
}
