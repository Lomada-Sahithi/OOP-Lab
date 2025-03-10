//factorial
import java.util.Scanner;
public class p3{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int a= sc.nextInt();
    int m=1;
    for(int i=1; i<a+1; i++){
       m=m*i;
    }
  System.out.println("Factorial is:"+ m);
 }
}