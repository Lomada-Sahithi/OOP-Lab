import java.io.FileWriter;   
import java.io.IOException; 
public class Record { 
public static void main(String[] args) { 
try { 
FileWriter myWriter = new FileWriter("record.txt"); 
myWriter.write("Java File Handling"); 
myWriter.close(); 
System.out.println("Successfully wrote to the file."); 
} catch (IOException e) { 
System.out.println("An error occurred."); 
e.printStackTrace(); 
} 
} 
}
