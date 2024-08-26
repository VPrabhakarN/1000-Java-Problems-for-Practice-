// Q.87) Implement a class Employee with attributes name, id, and salary. Write a method to calculate and display the annual salary.

class Employee {
    String name; 
    int id, salary;

    public Employee(String n, int i, int s){
        name = n;
        id = i;
        salary = s;
    }

    // method to display the annual income
    void show(){
        int annual = salary * 12;
        System.out.println("Annual Salary : " + annual);
    }
}

public class Q87_Class_and_Object_4 {
    public static void main(String [] args){

        // creating an instance of the class 
        Employee e1 = new Employee("Vijay Prabhakar Nagane", 1291, 120000);

        // displaying the annual income by calling method
        e1.show();
    }
}
