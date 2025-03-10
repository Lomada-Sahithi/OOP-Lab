// reverse a number
import java.util.Scanner;
public class p6{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    int rev=0;
    while(a>0){
      int n=a%10;
      rev=rev*10+n;
      a=a/10;
    }
  System.out.println(rev);
 }
}
  