// Q.86) Write a class Student with properties name and marks. Create methods to display the details and calculate the grade.

class Student {
    String name;
    int s1, s2, s3, s4, s5, s6;
    float grade;

    public Student(String str, int s1, int s2, int s3, int s4, int s5, int s6){
        name = str;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s4 = s5;
        this.s5 = s6;
    }

    // creating the method to display the name and calculate the grade
    public void details(){
        grade = (s1 + s2 + s3 + s4 + s5 + s6) / 6;
        System.out.println("****** Student Details *******");
        System.out.println("Name : " + name);
        System.out.println("Grade : "+ grade);
    }
}


public class Q86_Class_and_Object_3{
    public static void main(String [] args){

        // creating an instance of the class
        Student s1 = new Student("Vijay Prabhakar Nagane", 90, 96, 93, 91, 93, 99);

        // displaying the details
        s1.details();
    }
}
