// Q.88) Create a class Book with attributes title, author, and price. Write a method to display book details.

class  Book {
    String title, author;
    int price;

    public Book(String str, String auth, int p){
        title = str;
        author = auth;
        price = p;
    }

    // method to display the detials
    void display(){
        System.out.println("****** Book Details ******");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("*****************************");
    }
}


public class Q88_Class_and_Object_5 {
    public static void main(String [] args){
        
        // creating an instance of a class
        Book b1 = new Book("Who was the Chatrapati Shivaji ?", "Dr. Govind Pansare", 240);

        // displaying the details
        b1.display();
    }
}
