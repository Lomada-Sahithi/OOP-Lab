abstract class Shape3D {
 public abstract double volume();
 public abstract double surfaceArea(); 
} 
class Sphere extends Shape3D { 
double radius; 
Sphere(double radius) { 
    this.radius = radius; 
} 
public double volume() { 
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); 
}
public double surfaceArea() { 
    return 4 * Math.PI * Math.pow(radius, 2); 
}
}
class Cube extends Shape3D {
 double side;
Cube(double side) { 
    this.side = side; 
} 
public double volume() { 
    return Math.pow(side, 3); 
} 
 public double surfaceArea() { 
    return 6 * Math.pow(side, 2); 
} 
} 
public class Record {
 public static void main(String[] args) {
 Shape3D sphere = new Sphere(7.0);
 Shape3D cube = new Cube(6.0);
   System.out.println("Sphere Volume: " + sphere.volume()); 
    System.out.println("Sphere Surface Area: " + sphere.surfaceArea()); 
    System.out.println("Cube Volume: " + cube.volume()); 
    System.out.println("Cube Surface Area: " + cube.surfaceArea()); 
} 
}
