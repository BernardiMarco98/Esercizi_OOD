package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Executor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Benveuto nel client di Marco's Videogames!");
		System.out.println("Vuoi giocare a Gran Turismo o a Battlefield? (G/B)");

		String reader = new BufferedReader(new InputStreamReader(System.in)).readLine();

		if (reader.equalsIgnoreCase("G")) {
			Videogame granTurismo = new GranTurismo();
			granTurismo.play();
		} else if (reader.equalsIgnoreCase("B")) {
			Videogame battlefield = new Battlefield();
			battlefield.play();
		} else
			System.out.println("Valore inserito errato!");
	}

}
