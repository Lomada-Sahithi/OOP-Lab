import java.util.Scanner; 
abstract class Shape { 
abstract double area(); 
abstract double perimeter(); 
} 
class Square extends Shape{ 
double side; 
Square(double side){ 
this.side = side; 
} 
double area(){ 
return (side * side); 
} 
double perimeter(){ 
return (4 * side);
} 
} 
class Rectangle extends Shape {
double length; 
double breadth; 
Rectangle(double length, double breadth) { 
this.length = length; 
this.breadth = breadth; 
} 
double area(){ 
return (length * breadth); 
} 
double perimeter(){ 
return (2 * (length + breadth)); 
} 
} 
public class Record{ 
public static void main(String[] args) { 
Scanner s = new Scanner(System.in); 
System.out.println("Enter the side of the square: "); 
double side = s.nextDouble();
System.out.println("Enter length of the rectangle: "); 
double l = s.nextDouble();
System.out.println("Enter the breadth of the rectangle: "); 
double b = s.nextDouble(); 
Square sq = new Square(side); 
System.out.println("Square:"); 
System.out.println("Area: " + sq.area()); 
System.out.println("Perimeter: " + sq.perimeter()); 
System.out.println();
Rectangle rec = new Rectangle(l, b); 
System.out.println("Rectangle:"); 
System.out.println("Area: " + rec.area()); 
System.out.println("Perimeter: " + rec.perimeter());
} 
} 
