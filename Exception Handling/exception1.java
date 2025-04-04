import java.util.Scanner;
class Record {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the numerator: ");
int n = scanner.nextInt();
System.out.print("Enter the denominator: ");
int m = scanner.nextInt();
try {
int ans = n / m;
System.out.println("Answer: " + ans);
} 
catch (ArithmeticException e) {
System.out.println("Error: Division by zero is not allowed!");
} 
finally {
scanner.close();
System.out.println("Program continues after handling the exception.");
}
}
}
