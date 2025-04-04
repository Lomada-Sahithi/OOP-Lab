package Area; 
public class Rectangle {
int l;
int b;
public Rectangle(int l, int b) {
this.l = l;
this.b = b;
}
public void area(){
System.out.println("Area is: " + (l * b));
}
public void perimeter() {
System.out.println("Perimeter is: " + (2 * (l + b)));
}
}
import Area.Rectangle;  
import java.util.*;  
import java.io.*;

public class Record {
public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in); 
System.out.print("Enter length of the rectangle: ");
int length = sc.nextInt();
System.out.print("Enter breadth of the rectangle: ");
int breadth = sc.nextInt();
Rectangle r = new Rectangle(length, breadth);
r.area();
r.perimeter();
}
}
