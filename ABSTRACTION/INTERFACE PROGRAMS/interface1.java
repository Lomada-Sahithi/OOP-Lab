import java.util.Scanner; 
  interface Shape { 
    public double area(); 
    public double perimeter(); 
} 
class Square implements Shape { 
    double side; 
  
    Square(double side) { 
        this.side = side; 
    } 
    public double area() { 
        return (side * side); 
    } 
    public double perimeter() { 
        return (4 * side); 
    } 
} 
class Rectangle implements Shape { 
    double length; 
    double breadth; 
  
    Rectangle(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 
    public double area() { 
        return (length * breadth); 
    } 
     public double perimeter() { 
        return (2 * (length + breadth)); 
    } 
} 
  public class Record { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the square: "); 
        double side = s.nextDouble(); 
        System.out.println("Enter length of the rectangle: "); 
        double length = s.nextDouble(); 
        System.out.println("Enter the breadth of the rectangle: "); 
        double breadth = s.nextDouble(); 
        Square sq = new Square(side); 
        System.out.println("\nSquare:"); 
        System.out.println("Area: " + sq.area()); 
        System.out.println("Perimeter: " + sq.perimeter());
        Rectangle rec = new Rectangle(length, breadth); 
        System.out.println("\nRectangle:"); 
        System.out.println("Area: " + rec.area()); 
        System.out.println("Perimeter: " + rec.perimeter());
    } 
} 
