// Q.120) Create an interface Readable with a method read(). Then create an interface Writable that extends Readable and adds a method write(). Implement Writable in a class Document.

public class Q120_Interface_20 {
    public static void main(String[] args) {
        // creating an object of the class and calling methods
        Document d = new Document();
        d.read();
        d.write();
    }
}

interface Readable {
    abstract void read();
}

interface Writable extends Readable {
    abstract void write();
}

class Document {
    public Document(){
        System.out.println("This is document!");
    }

    // writing read and write method
    public void read(){
        System.out.println("Started Reading the document!");
    }

    public void write(){
        System.out.println("Started writing the document!");
    }
}


