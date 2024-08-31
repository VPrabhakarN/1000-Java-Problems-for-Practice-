// Q.105) Define two interfaces, Printable and Scannable, each with one method. Create a class PrinterScanner that implements both interfaces.

public class Q105_Interface_5 {
    public static void main(String []args){
        // creating an object and calling methods
        PrinterScanner pc = new PrinterScanner();
        pc.scan();
        pc.print();
    }
}

interface Printable {
    public void print();
}

interface Scannable {
    public void scan();
}

class PrinterScanner implements Printable, Scannable {
    public PrinterScanner(){
        System.out.println("Starting printing and scanning....!!!!");
    }

    public void scan(){
        System.out.println("Computer is scanning the documents!");
    }

    public void print(){
        System.out.println("Printing the documents");
    }
}