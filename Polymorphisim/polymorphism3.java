import java.util.Scanner;  
class Shape{  
public int area(int a, int b){ 
 return(a*b); 
 }  
public double area(double a){ 
 return(3.14*a*a); 
 } 
 } 
public class Record{ 
public static void main(String[] args){
Scanner s= new Scanner(System.in); 
System.out.println("Enter length of Rectangle:"); 
int l=s.nextInt();
System.out.println("Enter width of the Rectangle:");
int w=s.nextInt();
System.out.println("Enter radius of circle: ");
double r=s.nextDouble();
Shape a=new Shape(); 
System.out.println("Area of the Rectangle: "+a.area(l,w));
System.out.println("Area of the circle: "+a.area(r)); 
}
}
