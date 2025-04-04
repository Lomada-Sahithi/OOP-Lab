import java.util.Scanner; 
interface Employee {  
    void salary(double bonus); 
    void displayDetails(); 
} 
class Manager implements Employee {  
    double salary; 
    String name; 
    int empId; 
    int teamSize;
    Manager(double salary, String name, int empId, int teamSize) {  
        this.salary = salary; 
        this.name = name; 
        this.empId = empId; 
        this.teamSize = teamSize; 
    } 
    public void salary(double bonus) {  
        System.out.println("Base Salary: " + salary); 
        System.out.println("Bonus: " + bonus); 
        System.out.println("Total Salary: " + (salary + bonus)); 
    } 
    public void displayDetails() {  
        System.out.println("Name: " + name); 
        System.out.println("Employee ID: " + empId); 
        System.out.println("Team Size: " + teamSize); 
    } 
}  
class Programmer implements Employee {  
    double salary; 
    String name; 
    int empId; 
    String language; 
  
    Programmer(double salary, String name, int empId, String language) {  
        this.salary = salary; 
        this.name = name; 
        this.empId = empId; 
        this.language = language; 
    } 
     public void salary(double bonus) {  
        System.out.println("Base Salary: " + salary); 
        System.out.println("Bonus: " + bonus); 
        System.out.println("Total Salary: " + (salary + bonus)); 
    } 
    public void displayDetails() {  
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
        s.nextLine(); // Consume newline 
        System.out.println("Name of the Programmer: ");  
        String n2 = s.nextLine(); 
        System.out.println("Enter Employee ID: ");  
        int i2 = s.nextInt(); 
        s.nextLine(); // Consume newline 
        System.out.println("Enter Language Known: ");  
        String l = s.nextLine(); 
        System.out.println("Enter Salary of the Programmer: ");  
        double sal2 = s.nextDouble(); 
        System.out.println("Enter Bonus for Programmer: ");  
        double b2 = s.nextDouble(); 
        Employee m = new Manager(sal1, n1, i1, t); 
        Employee p = new Programmer(sal2, n2, i2, l); 
        System.out.println("\nManager Details:");  
        m.displayDetails(); 
        m.salary(b1); 
        System.out.println("\nProgrammer Details:");  
        p.displayDetails(); 
        p.salary(b2); 
    }  
} 

