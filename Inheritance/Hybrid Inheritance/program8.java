class Person{
String name;
int age;
Person(String name, int age){
this.name = name;
this.age = age;
}
void showDetails(){
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}
class Student extends Person {
String course;
Student(String name, int age, String course){
super(name, age);
this.course = course;
}
void study(){
System.out.println("Course: "+ course);
}
}
class Teacher extends Person{
String subject;
Teacher(String name, int age, String subject) {
super(name, age);
this.subject = subject;
}
void teach(){
System.out.println("Subject: "+subject);
}
}
class GraduateStudent extends Student {
String researchTopic;
GraduateStudent(String name, int age, String course, String researchTopic) {
super(name, age, course);
this.researchTopic = researchTopic;
}
void conductResearch(){
System.out.println("Research Topic: "+researchTopic);
}
}
public class Record{
public static void main(String[] args) {
Student s= new Student("Sahithi", 20, "Computer Science");
System.out.println("Student:");
s.showDetails();
s.study();
System.out.println();
System.out.println("Teacher:");
Teacher t = new Teacher("Sanjana", 40, "Mathematics");
t.showDetails();
t.teach();
System.out.println();
GraduateStudent g= new GraduateStudent("Samyuktha", 25, "Physics", "Quantum Mechanics");
System.out.println("Research:");
g.showDetails();
g.study();
g.conductResearch();
}
}
