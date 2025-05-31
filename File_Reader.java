import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class File_Reader {
   public static void read(File file){
      	String data;
	try {
        Scanner scanner = new Scanner(file);
        data = scanner.nextLine();
        System.out.println(data);
	String[] separated_terms = data.split("[-\\+]");
	System.out.println(separated_terms.length);
	double[] co = new double [separated_terms.length];
	int[] e = new int [separated_terms.length];
	int index=0;
	String[] terms = data.split("[+]");
		for(int i=0;i<terms.length;i++){
		if(terms[i].indexOf('-')!=-1){
			String[] more_terms = terms[i].split("[-]");
			System.out.println("adding minus");
			// adding the negative signs 
			for(int j=1;j<more_terms.length;j++){
				more_terms[j] = "-"+more_terms[j];
				System.out.println(more_terms[j]+"\n");
			}
			// adding values to the arrays
			for(int k=0;k<more_terms.length;k++){
				if(more_terms[k].length()==1){
					co[index]=Double.parseDouble(more_terms[k]);
					e[index]=0;
					index++;
				}
				else{
					String[] numbers = more_terms[k].split("x");
					co[index]=Double.parseDouble(numbers[0]);
					e[index]= Integer.parseInt(numbers[1]);
					index++;


				}
			}

		}
		else{
			String[] numbers = terms[i].split("x");
			co[index]=Double.parseDouble(numbers[0]);
			e[index]= Integer.parseInt(numbers[1]);
			index++;

		}
		System.out.println(terms[i]);

		}
		System.out.println("checking");
		for( int m=0; m<co.length;m++){
			System.out.println(co[m]+"x"+e[m]+"\n");

		}
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