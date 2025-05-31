import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
   public void read(File file){
      try {
      //File myObj = new File("filename.txt");
      Scanner scanner = new Scanner(file);
      //while (myReader.hasNextLine()) {
        String data = scanner.nextLine();
        System.out.println(data);
	
      //}
      scanner.close();
    	} catch (FileNotFoundException e) {
      	System.out.println("An error occurred.");
      	e.printStackTrace();
    	}
    }

    public static void main(String[] args) {
       read(File_Reader.txt);
  }
  	
}