import java.util.Scanner;
class Employee{
double baseSalary;
Employee(double baseSalary){
this.baseSalary=baseSalary;
}
public void display(){
System.out.println("Base Salary: "+baseSalary);
}
}
class Manager extends Employee{
double bonus;
Manager(double baseSalary, double bonus){
super(baseSalary);
this.bonus=bonus;
}
public void Salary(){
System.out.println("Total Salary: "+(baseSalary+bonus));
}
}
class HR extends Employee{
double bonus;
HR(double baseSalary, double bonus){
super(baseSalary);
this.bonus=bonus;
}
public void Salary(){
System.out.println("Total Salary: "+(baseSalary+bonus));
}
}
public class Record{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter the base salary for Manager: ");
double b1=s.nextDouble();
System.out.println("Enter the bonus for Manager: ");
double bonus1=s.nextDouble();
System.out.println("Enter the base salary for HR: ");
double b2=s.nextDouble();
System.out.println("Enter the bonus for HR: ");
double bonus2=s.nextDouble();
Manager m=new Manager(b1, bonus1);
HR h=new HR(b2,	 bonus2);
System.out.println("Manager: ");
m.display();
m.Salary();
System.out.println("HR: ");
h.display();
h.Salary();
}
}
