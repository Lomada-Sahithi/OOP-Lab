import java.util.Scanner;
public class p10{
  public static void main(String[] args){
    boolean result;
    Scanner s= new Scanner(System.in);
    do{
       System.out.println("Enter the student avg");
       float avg=s.nextFloat();

       if(avg >=90)
         System.out.println("Grade A");
       else if(avg>=80 && avg<90)
         System.out.println("Grade B");
       else if(avg>=60 && avg<80)
         System.out.println("Grade C");
       else
         System.out.println("Grade D");
    
    System.out.println("Student belong to Sec-A true/false");
    result= s.nextBoolean();
   }while(result);
  
}
}
    