import java.util.Scanner;
class Employee{
String name;
double salary;
Employee(String name, double salary){
this.name=name;
this.salary=salary;
}
public void display(){
System.out.println("Name: "+name);
System.out.println("Salary: "+salary);
}
}
class Manager extends Employee{
Manager(String name, double salary){
super(name, salary);
}
public void display(){
System.out.println("Name: "+name);
System.out.println("Salary: "+salary);
}
}

public class Record{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter name of the employee: ");
String name=s.nextLine();
System.out.println("Enter salary of the employee: ");
double sal=s.nextDouble();
s.nextLine();
System.out.println("Enter name of the Manager: ");
String name1=s.nextLine();
System.out.println("Enter salary of the Manager: ");
double sal1=s.nextDouble();
Employee e=new Employee(name, sal);
Manager m=new Manager(name1, sal1);
System.out.println("Employee details:");
e.display();
System.out.println();
System.out.println("Manager details: ");
m.display();

}
}
