package commandPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Luce lampadina = new Luce();
		Interruttore interruttoreLampadina = new Interruttore();

		Command accendiLampadina = new Accendi(lampadina);
		Command spegniLampadina = new Spegni(lampadina);

		while (true) {
			try {
				System.out.println("Vuoi accendere o spegnere la lampadina? (A/S)");
				System.out.print(">");
				String reader = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if (reader.equalsIgnoreCase("A")) {
					interruttoreLampadina.execute(accendiLampadina);
				} else if (reader.equalsIgnoreCase("S")) {
					interruttoreLampadina.execute(spegniLampadina);
				} else {
					System.out.println("Inserire 'A' o 'S'");
					System.out.println("-------------------");
				}

			} catch (Exception e) {
				System.out.println("Inserire 'A' o 'S'");
				System.out.println("-------------------");
			}
		}

	}

}
