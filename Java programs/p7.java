import java.util.Scanner;
public class p7{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number to break the loop in the range 1-10:");
    int o=s.nextInt();
    System.out.println("The numbers are:");
    for (int i = 1; i <= 10; ++i) { 
       if (i == o){
         break;
       }
       System.out.println(i);
       
     }   
   }
}