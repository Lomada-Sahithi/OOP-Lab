import java.util.Scanner;

class House {
    private double Area;
public double getArea(){
return Area;
}
public void setArea(double Area){
this.Area = Area;
}
public void displayArea(double Area){
System.out.println("Area of the house: "+ Area);
}
public void Cost(double Area) {
System.out.println("Total Amount: "+Area*100);
}
}
public class Record {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
House h = new House();
System.out.println("Enter the Area: ");
double Area= s.nextDouble();
h.setArea(Area);
double a=h.getArea();
h.displayArea(Area);
h.Cost(Area);
    }
}
