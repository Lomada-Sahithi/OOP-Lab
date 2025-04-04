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
public class Record {
public static void main(String[] args) {
Rectangle r = new Rectangle(5, 10); 
r.area();
r.perimeter();
}
}
