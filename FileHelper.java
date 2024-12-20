import java.io.FileNotFoundException; // imports the FileNotFoundException class, which is used for handling errors when a file is not found.
import java.io.IOException;// imports the IOException class, which is used for handling input-output related errors, such as issues reading from a file.
import java.nio.file.Files;// imports the Files class from the java.nio.file package, which provides methods for working with file systems, such as reading files.
import java.nio.file.Paths;// imports the Paths class from the java.nio.file package, which is used to create Path objects to represent file or directory paths.

public class FileHelper { // a class, which is responsible for file-related operations such as loading data from a file.
    public void loadCartFromFile(String fileName) { //a method, which takes a fileName as input and attempts to read the contents of the specified file.
        try { // begin a try block, which is used to handle any exceptions that may occur while reading the file.
            Files.readAllLines(Paths.get(fileName)); // Simulating file reading
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error: Problem reading the file: " + fileName);
        }
    }
}
