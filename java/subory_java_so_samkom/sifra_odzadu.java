import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class sifra_odzadu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader inputFile = new BufferedReader(new FileReader("vstup.txt"));
			BufferedWriter outputFile = new BufferedWriter(new FileWriter("sifrovany.txt"));
			
			String line;
			while ((line = inputFile.readLine()) != null) {
				if (line.charAt(line.length() - 1) == '.' || line.charAt(line.length() - 1) == ',') {
					String substring = line.substring(0, line.length() - 1);
					StringBuilder s = new StringBuilder();
					s.append(substring);
					s.reverse();
					outputFile.write(s.toString() + line.charAt(line.length() - 1) + "\n");
					
				} else {
					StringBuilder s = new StringBuilder();
					s.append(line);
					s.reverse();
					outputFile.write(s.toString() + "\n");
				}
			}
			
			inputFile.close();
			outputFile.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("nejde to :(");
		}
	
	}

}
