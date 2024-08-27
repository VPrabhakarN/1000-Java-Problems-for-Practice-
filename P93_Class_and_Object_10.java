import java.util.ArrayList;

// Student 
class Student {
    private String name;
    private int rollnumber;

    public Student(String name, int rollnumber){
        this.name = name;
        this.rollnumber = rollnumber;
    }

    // Method to display the details
    public void displayStudent(){
        System.out.println("Roll Number: " + rollnumber + " , Name: " + name);
    }
}

// School 
class School {
    private ArrayList<Student> students;

    public School(){
        students = new ArrayList<>();
    }

    // Method to add students
    public void addStudent(String name, int rollnumber){
        Student student = new Student(name, rollnumber);
        students.add(student);
    }

    // Method to display all students 
    public void displayAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students enrolled.");
        } else {
            System.out.println("List of Students:");
            for(Student student : students){
                student.displayStudent();
            }
        }
    }
}

public class P93_Class_and_Object_10 {
    public static void main(String[] args) {
        // Creating an instance of class School
        School school = new School();

        // Adding students 
        school.addStudent("Vijay", 19);
        school.addStudent("Tanvi", 23);
        school.addStudent("Rushi", 21);
        
        // Display all the students
        school.displayAllStudents();
    }
}
