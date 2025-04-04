import java.util.Scanner;
class Employee{
public double Salary(double Salary){
return(Salary);
}

public double Salary(double Salary, double Bonus){
return(Salary+Bonus);
}
}
public class Record{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Salary: ");
double sal=s.nextDouble();
System.out.println("Enter the Bonus: ");
double bonus=s.nextDouble();
Employee e=new Employee();
System.out.println("Salary: "+e.Salary(sal));
System.out.println("Salary + Bonus: "+e.Salary(sal, bonus));
}
}
