import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class file1 {
public static void main(String[] args) {
try {
File file = new File("sample.txt");
if (file.createNewFile()) {
System.out.println("File created: " + file.getName());
} else {
System.out.println("File already exists.");
}
System.out.println("File Name: " + file.getName());
System.out.println("File Path: " + file.getAbsolutePath());
System.out.println("Writable: " + file.canWrite());
System.out.println("Readable: " + file.canRead());
System.out.println("File Size: " + file.length() + " bytes");

FileWriter writer = new FileWriter("sample.txt");
writer.write("Hello, this is file handling in Java.\n");
writer.write("This file is created and written using FileWriter.");
writer.close();
System.out.println("Data written to file.");

FileReader reader = new FileReader("sample.txt");
int ch;
System.out.println("\nFile Content:");
while ((ch = reader.read()) != -1) {
System.out.print((char) ch);
}
reader.close();
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
}