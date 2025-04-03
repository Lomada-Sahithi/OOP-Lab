import java.util.Scanner;
class House{
double length;
double width;
House(double length, double width){
this.length=length;
this.width=width;
}
}
class Area extends House{
Area(double length, double  width){
super(length,width);
}
public double AreaofHouse(){
return(length*width);
}
}
class Volume extends Area{
double height;
Volume(double length, double width, double height){
super(length,width);
this.height=height;
}
public double volume(){
return(length*width*height);
}
}
public class Record{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of the house:");
double length=s.nextDouble();
System.out.println("Enter the width of the house:");
double width=s.nextDouble();
System.out.println("Enter the height of the house:");
double height=s.nextDouble();
Volume v=new Volume(length, width, height);
System.out.println("Area of the House: "+v.AreaofHouse());
System.out.println("Volume of the HOuse: "+v.volume());
}
}
