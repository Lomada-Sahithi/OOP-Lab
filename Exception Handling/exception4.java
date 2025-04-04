public class Record{
public static void main(String[] args) {
try {
String str = null;
System.out.println(str.length());
} catch (NullPointerException e) {
System.out.println("Error: Cannot access length of a null string.");
} finally {
System.out.println("Execution completed.");
}
}
}
