import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class subory_prvy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader file = new FileReader("vstup.txt");
			BufferedReader reader = new BufferedReader(file);
			String riadok;
			int pocetRiadkov = 0;
			int pocetZnakov = 0;
			ArrayList<String> riadky = new ArrayList<>();
			ArrayList<Integer> dlzkyRiadkov = new ArrayList<>();
			while ((riadok = reader.readLine()) != null) {
				System.out.println(riadok);
				int dlzkaRiadku = riadok.length();
				riadky.add(riadok);
				dlzkyRiadkov.add(dlzkaRiadku);
				pocetRiadkov++;
				pocetZnakov += dlzkaRiadku;
			}
			System.out.println("-----------");
			reader.close();
			System.out.println("Pocet riadkov: " + pocetRiadkov);
			System.out.println("Pocet znakov: " + pocetZnakov);
			
			int maxDr = Collections.max(dlzkyRiadkov);
			int minDr = Collections.min(dlzkyRiadkov);
			
			System.out.println("Najdlhsi riadok ma: " + maxDr + " znakov");
			System.out.println("Najkratsi riadok ma: " + minDr + " znakov");
			
			System.out.println("-----------");
			
			System.out.println("Najdlhsie riadky:");
			for (int i = 0; i < dlzkyRiadkov.size(); i++) {
				if (dlzkyRiadkov.get(i) == maxDr) {
					System.out.println(riadky.get(i));
				}
			}
			
			System.out.println("-----------");
			
			System.out.println("Najkratsie riadky:");
			for (int i = 0; i < dlzkyRiadkov.size(); i++) {
				if (dlzkyRiadkov.get(i) == minDr) {
					System.out.println(riadky.get(i));
				}
			}
			
			System.out.println("-----------");
			
			
			
			
		} catch (IOException e) {
			System.out.println("chyba");
		}
	}

}
