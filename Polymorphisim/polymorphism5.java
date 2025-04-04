class Shape {
double calculateArea() {
return 0;
}
}
class Circle extends Shape {
double radius;
Circle(double radius) {
this.radius = radius;
}
double calculateArea() {
return Math.PI * radius * radius;
}
} 
class Rectangle extends Shape {
double width;
double height;
Rectangle(double width, double height) {
this.width = width;
this.height = height;
}
double calculateArea() {
return width * height;
}
} 
public class Record {
public static void main(String[] args) {
Circle circle = new Circle(10);
System.out.println("Area of Circle: " + circle.calculateArea());
Rectangle rectangle = new Rectangle(10, 20);
System.out.println("Area of Rectangle: " + rectangle.calculateArea());
}
}
