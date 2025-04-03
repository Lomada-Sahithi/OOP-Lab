import java.util.Scanner;
class Account {
    String name;
    String AccNo;
    double bal;
    Account(String name, String AccNo, double bal) {  
        this.name = name;
        this.AccNo = AccNo; 
        this.bal = bal;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + AccNo);
        System.out.println("Balance: " + bal);
    }
}
class BankAccount extends Account {
    BankAccount(String name, String AccNo, double bal) {
        super(name, AccNo, bal);
    }
    public void withdraw(double amount) {
        if (bal >= amount) {
            bal -= amount;
            System.out.println("Balance after withdrawal: " + bal);
        } else {
            System.out.println("Insufficient Balance");
}
    }
    public void deposit(double amount) {
        bal += amount;
        System.out.println("Balance after deposit: " + bal);
    }
}
public class Record {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = s.nextLine();
        System.out.println("Enter Account Number: ");
        String AccNo = s.nextLine(); 
        System.out.println("Enter Balance in your account: ");
        double bal = s.nextDouble();
        BankAccount b = new BankAccount(name, AccNo, bal);
        b.displayDetails();
        System.out.println("Enter the amount to withdraw:");
        double withdrawAmount = s.nextDouble();
        b.withdraw(withdrawAmount);
        System.out.println("Enter the amount to deposit:");
        double depositAmount = s.nextDouble();
        b.deposit(depositAmount);    
    }
}
