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
import java.util.*;  
import java.io.*;

public class Record {
public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter Name: ");
String name = br.readLine();
System.out.print("Enter Account Number: ");
String accNo = sc.next();
System.out.print("Enter Initial Balance: ");
double balance = sc.nextDouble();
Account acc = new Account(name, accNo, balance);
acc.displayDetails();
System.out.print("Enter amount to withdraw: ");
double withdrawAmount = sc.nextDouble();
acc.withdraw(withdrawAmount);
System.out.print("Enter amount to deposit: ");
double depositAmount = sc.nextDouble();
acc.deposit(depositAmount);
}
}
