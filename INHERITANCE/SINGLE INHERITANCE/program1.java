import java.util.Scanner;
class Employee{
double salary;
Employee(double salary){
this.salary=salary;
}
}
class Programmer extends Employee{
double bonus;
Programmer(double bonus, double salary){
super(salary);
this.bonus=bonus;
}
public void totalSalary(){
System.out.println(salary+bonus);
}
}
public class Record{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Salary: ");
double salary=s.nextDouble();
System.out.println("Enter the bonus: ");
double bonus=s.nextDouble();
Programmer p=new Programmer(salary,bonus);
p.totalSalary();
}
}
