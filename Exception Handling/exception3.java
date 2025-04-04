class Record{
public static void main(String args[]) {
try {
String a = "Java File Handling ";
char c = a.charAt(24); 
System.out.println(c);
} 
catch (StringIndexOutOfBoundsException e) {
System.out.println("StringIndexOutOfBoundsException occurred!");
} 
finally {
System.out.println("Execution completed");
}
}
}
