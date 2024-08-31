// Q.107) Create an interface RemoteControl with a method pressButton(). Write a method that takes a RemoteControl as a parameter and calls pressButton().

public class Q107_Interface_7 {

    public static void control(RemoteControl rmt){
        rmt.pressButton();
    }
    public static void main(String [] args){
        // creating an object of interface and class 
        RemoteControl remote = new TVcontrol();
        control(remote);


    }
}

interface RemoteControl {
    public void pressButton();
}

class TVcontrol implements RemoteControl {
    public void pressButton(){
        System.out.println("Pressed button ! TV is on now.");
    } 
}


