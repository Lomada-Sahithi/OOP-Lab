import java.util.Scanner; 
abstract class Employee { 
double salary; 
String name; 
int empId; 
Employee(double salary, String name, int empId) { 
this.salary = salary; 
this.name = name; 
this.empId = empId; 
} 
abstract void Salary(double bonus); 
abstract void displayDetails(); 
} 
class Manager extends Employee { 
int teamSize; 
Manager(double salary, String name, int empId, int teamSize) { 
super(salary, name, empId); 
this.teamSize = teamSize; 
}  
void Salary(double bonus){ 
System.out.println("Base Salary: " + salary); 
System.out.println("Bonus: " + bonus); 
System.out.println("Total Salary: " + (salary + bonus)); 
} 
void displayDetails() { 
System.out.println("Name: " + name); 
System.out.println("Employee ID: " + empId); 
System.out.println("Team Size: " + teamSize); 
} 
} 
class Programmer extends Employee { 
String language; 
Programmer(double salary, String name, int empId, String language) { 
super(salary, name, empId); 
this.language = language; 
} 
void Salary(double bonus) { 
System.out.println("Base Salary: " + salary); 
System.out.println("Bonus: " + bonus); 
System.out.println("Total Salary: " + (salary + bonus)); 
} 
void displayDetails() { 
System.out.println("Name: " + name); 
System.out.println("Employee ID: " + empId); 
System.out.println("Language Known: " + language); 
} 
} 

public class Record{ 
public static void main(String[] args) { 
Scanner s = new Scanner(System.in); 
System.out.println("Name of the Manager: "); 
String n1 = s.nextLine(); 
System.out.println("Enter Employee ID: "); 
int i1 = s.nextInt(); 
System.out.println("Enter Team Size: "); 
int t = s.nextInt(); 
System.out.println("Enter Salary of the Manager: "); 
double sal1 = s.nextDouble(); 
System.out.println("Enter Bonus for Manager: "); 
double b1 = s.nextDouble(); 
s.nextLine(); 
System.out.println("Name of the Programmer: ");
String n2 = s.nextLine(); 
System.out.println("Enter Employee ID: "); 
int i2 = s.nextInt(); 
s.nextLine(); 
System.out.println("Enter Language Known: "); 
String l = s.nextLine(); 
System.out.println("Enter Salary of the Programmer: "); 
double sal2 = s.nextDouble(); 
System.out.println("Enter Bonus for Programmer: "); 
double b2 = s.nextDouble(); 
Manager m = new Manager(sal1, n1, i1, t); 
Programmer p = new Programmer(sal2, n2, i2, l); System.out.println("\nManager Details:"); 
m.displayDetails(); 
m.Salary(b1); 
System.out.println("\nProgrammer Details:"); 
 p.displayDetails();
 p.Salary(b2); 
 }
}
