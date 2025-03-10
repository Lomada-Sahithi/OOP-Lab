import java.util.Scanner;
public class p8{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number to skip in the range of 1-10:");
    int o=s.nextInt();
    System.out.println("The numbers are:");
    for(int i=0; i<=10; i++){
       if(i==o){
          continue;
       }
       System.out.println(i);
     }
  }
}   
    
