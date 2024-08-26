// Q.90) Implement a BankAccount class with deposit and withdraw methods.

class BankAccount {
    int balance;

    public BankAccount(){
        balance = 100;
    }

    // method to deposite the amount 
    void deposite( int a){
       
        System.out.println("Your balance before deposite is $" + balance);
        System.out.println(a + "$ is deposited into your account");
        balance = balance + a;
        System.out.println("Your current balance after deposite $" + balance);
    }

    // method to withdraw the ammount 
    void withdraw(int a){
        System.out.println("Your balance before withdraw is $" + balance);
        System.out.println(a + "$ is amount for withdrawal");
        balance = balance + a;
        System.out.println("Your current balance after withdraw is $" + balance);
    }
}

public class Q90_Class_and_Object_7 {
    public static void main(String []args){

        // creating an instance of the class
        BankAccount t1 = new BankAccount();

        // deposite the amount 
        t1.deposite(1000);

        System.out.println();

        // credit the amout 
        t1.withdraw(250);
    }
}
