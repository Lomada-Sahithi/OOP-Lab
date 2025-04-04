class Employee{
String name;
int empId;
double salary;
Employee(String name, int empId, double salary){
this.name = name;
this.empId = empId;
this.salary = salary;
}
void showDetails(){
System.out.println("Employee ID: " + empId);
System.out.println("Name: " + name); 
System.out.println("Salary: " + salary);
}
}
class Developer extends Employee{
String language;
Developer(String name, int empId, double salary, String language){
super(name, empId, salary);
this.language = language;
}
void writeCode(){
System.out.println("Language known:" + language);
}
}
class Manager extends Employee {
int teamSize;
Manager(String name, int empId, double salary, int teamSize) {
super(name, empId, salary);
this.teamSize = teamSize;
}
void manageTeam(){
System.out.println(name + " is managing a team of " + teamSize + " employees.");
}
}
class TechLead extends Developer{
TechLead(String name, int empId, double salary, String language){
super(name, empId, salary, language);
}
void leadProject() {
System.out.println(name + " is leading the project and coding in " + language);
}
}
public class Record {
public static void main(String[] args) {
Developer d = new Developer("Ram", 101, 75000, "Java");
d.showDetails();
d.writeCode();
System.out.println();
Manager m = new Manager("Sahithi", 201, 90000, 10);
m.showDetails();
m.manageTeam();
System.out.println();
TechLead l = new TechLead("Sanjana", 301, 100000, "Python");
l.showDetails();
l.writeCode();
l.leadProject();
}
}

