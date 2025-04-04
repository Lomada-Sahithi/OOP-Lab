import java.util.Scanner;
class Employee {
String name;
int empId;
Employee(String name, int empId) {
this.name = name;
this.empId = empId;
}
public void display() {
System.out.println("Employee ID: " + empId );
System.out.println("Name: " + name);
}
}
class Developer extends Employee {
String language;
Developer(String name, int empId, String language) {
super(name, empId);
this.language = language;
}
public void work(){
System.out.println("Programming language known: "+language);
}
}
class Manager extends Employee {
int teamSize;
Manager(String name, int empId, int teamSize) {
super(name, empId);
this.teamSize = teamSize;
}
public void manager(){
System.out.println("Team size: "+teamSize);
}
}
public class Record{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the name of the developer: ");
String n1=s.nextLine();
System.out.println("Enter employee id: ");
int i1=s.nextInt();
s.nextLine();
System.out.println("Entet the language known: ");
String l=s.nextLine();
System.out.println("Enter the name of the Manager: ");
String n2=s.nextLine();
System.out.println("Enter employee id: ");
int i2=s.nextInt();
System.out.println("Enter the team size: ");
int t=s.nextInt();
Developer d= new Developer(n1,i1,l);
System.out.println("Developer Details");
d.display();
d.work();
System.out.println();
Manager m = new Manager(n2,i2,t);
System.out.println("Manager details");
m.display();
m.manager();
}
}
