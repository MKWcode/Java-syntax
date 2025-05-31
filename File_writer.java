import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class File_writer {
	public static void write(String file_Name){
	try {
      		FileWriter writer = new FileWriter(file_Name);
      		writer.write("Writing to a file!");
     		writer.close();
      		System.out.println("Successfully wrote to the file.");
    	} catch (IOException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    		}
    	}
 	

  public static void main(String[] args) {
    	write("Messages.txt");
  }
}