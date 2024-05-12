import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class kopiaSuboru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader inputFile = new FileReader("vstup.txt");
			BufferedReader inputRead = new BufferedReader(inputFile);
			
			FileWriter outputFile = new FileWriter("vystup.txt");
			BufferedWriter output = new BufferedWriter(outputFile);
			
			String line;
			while ((line = inputRead.readLine()) != null) {
				output.write(line + "\n");
			}
			
			inputRead.close();
			output.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Chyba so suborom");
		}
	}

}
