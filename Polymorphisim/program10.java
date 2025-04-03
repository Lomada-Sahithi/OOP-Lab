class Employee {
String name;
int age;
double salary;
Employee(String name) {
this.name = name;
this.age = 0;
 this.salary = 0.0;
 }
 Employee(String name, int age) {
 this.name = name;
 this.age = age;
 this.salary = 0.0;
 }
 Employee(String name, int age, double salary) {
 this.name = name;
 this.age = age;
 this.salary = salary;
 }
void display() {
System.out.println("Employee Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}
public class Record{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sahithi"); 
        Employee emp2 = new Employee("Sahithi", 20); 
        Employee emp3 = new Employee("Sahithi", 20, 50000); 
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
