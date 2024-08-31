// Q.106) Create an interface Action with a method execute(). Implement this interface in classes AttackAction and DefendAction.

public class Q106_Interface_6 {
    public static void main(String [] args){
        // creating an object of class AttackAction and calling the method 
        AttackAction am = new AttackAction();
        am.execute();

        // creating an object of class DefendAction and calling the method 
        DefendAction dm = new DefendAction();
        dm.execute();
    }
}

interface Action {
    void execute();
}

class AttackAction {
    public AttackAction(){
        System.out.println("Attak mode is on!");
    }

    void execute(){
        System.out.println("Attak! Attak! Attack!");
    }
}

class DefendAction {
    public DefendAction(){
        System.out.println("Defend mode is on!");
    }

    void execute(){
        System.out.println("Defend! Defend! Defend!");
    }
}