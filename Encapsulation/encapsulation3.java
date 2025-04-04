import java.util.Scanner;
class Bank{
private String Accno;
private String Name;
private double bal;
public String getAccno(){
return Accno;
}
public String getName(){
return Name;
}
public double getbal(){
return bal;
}
public void setAccno(String Accno){
this.Accno=Accno;
}
public void setName(String Name){
this.Name=Name;
}
public void setbal(double bal){
this.bal=bal;
}
public void withdraw(double amount){
if (bal>0){
bal-=amount;
System.out.println("Amount after withdrawal: "+ bal);
}
else{
System.out.println("Insufficient Balance");
}
}
public void deposit(double amount){
bal+=amount;
System.out.println("Amount after deposit: "+bal);
}
public void displayDetails(){
System.out.println("Account no: "+ Accno);
System.out.println("Name: "+Name);
System.out.println("Balance: "+bal);
}
}
public class Record{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
Bank b= new Bank();
System.out.println("Enter your Account No.");
String Accno=s.nextLine();
System.out.println("Enter your Name: ");
String Name=s.nextLine();
System.out.println("Enter the balance");
double bal=s.nextDouble();
System.out.println("Enter the amount: ");
double amount=s.nextDouble();
b.setAccno(Accno);
b.setName(Name);
b.setbal(bal);
String a=b.getAccno();
String n=b.getName();
double d=b.getbal();
b.withdraw(amount);
b.deposit(amount);
b.displayDetails();
}
}
