//sum of digits of a number
import java.util.Scanner;
public class p1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    int sum=0;
    while(a>0){
      int n=a%10;
      sum=sum+n;
      a=a/10;
    }
  System.out.println(sum);
 }
}
  