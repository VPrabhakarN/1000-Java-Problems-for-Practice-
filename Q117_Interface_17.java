// Q.117) Create an interface Notifier with a method notifyUser(). Implement this interface in a class EmailNotifier.

public class Q117_Interface_17 {
    public static void main(String[] args) {
        // creating an object of the class and call the methods
        EmailNotifier sms = new EmailNotifier();
        sms.notifyUser();
    }
}

interface Notifier {
    abstract void notifyUser();
}

class EmailNotifier implements Notifier {
    public EmailNotifier(){
        System.out.println("***** New Notifications ***** ");
    }

    public void notifyUser(){
        System.out.println("13+ new messeges from Instagram");
        System.out.println("44+ new messeges from WhatsApp");
        System.out.println("10+ new messeges from LinkedIn");
        System.out.println("121+ new messeges from Telegram");
    }
}
