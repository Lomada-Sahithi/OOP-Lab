import java.util.Scanner;
class sem1{
double avg1;
sem1(double avg1){
this.avg1=avg1;
}
}
class sem2 extends sem1{
double avg2;
sem2(double avg1, double avg2){
super(avg1);
this.avg2=avg2;
}
}
class sem3 extends sem2{
double avg3;
sem3(double avg1, double avg2, double avg3){
super(avg1, avg2);
this.avg3=avg3;
}
}
class sem4 extends sem3{
double avg4;
sem4(double avg1, double avg2, double avg3, double avg4){
super(avg1, avg2, avg3);
this.avg2=avg2;
this.avg3=avg3;
this.avg4=avg4;
}
public void OverallAvg(){
System.out.println("Overall avg of the student after sem4: "+(avg1+ avg2+ avg3+ avg4)/4);
}
}
public class Record{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter sem1 avg: ");
double avg1=s.nextDouble();
System.out.println("Enter sem2 avg: ");
double avg2=s.nextDouble();
System.out.println("Enter sem3 avg: ");
double avg3=s.nextDouble();
System.out.println("Enter sem4 avg: ");
double avg4=s.nextDouble();
sem4 a= new sem4(avg1, avg2, avg3, avg4);
a.OverallAvg();
}
}
