import java.util.Scanner;
class Rectangle {
    private double length;
    private double width;

public double getlength(){
return length;
}
public double getwidth(){ 
return width;
}
public void setlength(double length){
this.length = length;
}
public void setwidth(double width){
this.width = width;
}
public void Area() {
System.out.println("Area: " + (length * width));
}
public void perimeter(){
System.out.println("Perimeter: "+ 2 * (length + width));
}
}

public class Record {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
Rectangle r = new Rectangle();
System.out.println("Enter the length: ");
double length= s.nextDouble();
System.out.println("Enter the width: ");
double width= s.nextDouble();
r.setlength(length);
r.setwidth(width);
double t=r.getlength();
double u=r.getwidth();
r.Area();
r.perimeter();
    }
}
