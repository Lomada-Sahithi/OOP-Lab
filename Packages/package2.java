package Bank;
public class Account{
public String name;
public String AccNo;
public double bal;
public Account(String name, String AccNo, double bal) {  
this.name = name;
this.AccNo = AccNo; 
this.bal = bal;
}
public void displayDetails(){
System.out.println("Name: " + name);
System.out.println("Account Number: " + AccNo);
System.out.println("Balance: " + bal);
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
import Bank.Account;  
public class Record {
public static void main(String[] args) {
Account a = new Account("Sahithi", "123", 30000); 
a.displayDetails();
a.withdraw(3000);
a.deposit(10000);
}
}
