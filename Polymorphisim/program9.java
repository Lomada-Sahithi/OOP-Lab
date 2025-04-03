import java.util.Scanner;
class Room{
  double length;
  double width;
  Room(double length, double width){
    this.length=length;
    this.width=width;
    }
   void area(){
     System.out.println(length*width);
   }
}
class Height extends Room{
   double height;
   Height(double length, double width, double height){
     super(length, width);
     this.height=height;
   }
   void vol(){
     System.out.println(length*width*height);
   }
}

public class practice{
  public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter length");
    double length=s.nextDouble();
    System.out.println("enter width");
    double width=s.nextDouble(); 
    System.out.println("Enter Height");
    double height=s.nextDouble();
    Height p= new Height(length, width, height);
    p.area();
    p.vol();
  }
}
