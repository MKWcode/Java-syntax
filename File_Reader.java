import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class File_Reader {
   public static void read(File file){
      try {
        Scanner scanner = new Scanner(file);
        String data = scanner.nextLine();
        System.out.println(data);
	
      scanner.close();
    	} catch (FileNotFoundException e) {
      	System.out.println("An error occurred.");
      	e.printStackTrace();
    	}
    }

    public static void main(String[] args) {
        File myFile = new File("File_Reader.txt");
	read(myFile);
  }
  	
}