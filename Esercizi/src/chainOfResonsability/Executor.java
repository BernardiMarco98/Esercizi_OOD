package chainOfResonsability;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Executor {

	public static void main(String[] args) {
		Responsabile responsabile = new Responsabile();
		Direttore direttore = new Direttore();

		responsabile.setSuccessor(direttore);
		while (true) {
			try {
				System.out.println("Inserire il proprio stipedio attuale.");
				System.out.print(">");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				int stipendioAttuale = Integer.parseInt(reader.readLine());
				responsabile.processRequest(new RichiestaAumento(stipendioAttuale, "Impiegato del mese"));

			} catch (Exception e) {
				System.out.println("Inserire un valore numerico");
			}
		}
	}
}
